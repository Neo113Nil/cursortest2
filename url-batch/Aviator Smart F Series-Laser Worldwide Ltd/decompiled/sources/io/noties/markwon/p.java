package io.noties.markwon;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.noties.markwon.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
class p implements i.b {
    private final List<i> origin;
    private final Set<i> pending = new HashSet(3);
    private final List<i> plugins;

    p(@NonNull List<i> list) {
        this.origin = list;
        this.plugins = new ArrayList(list.size());
    }

    private void configure(@NonNull i iVar) {
        if (this.plugins.contains(iVar)) {
            return;
        }
        if (this.pending.contains(iVar)) {
            throw new IllegalStateException("Cyclic dependency chain found: " + this.pending);
        }
        this.pending.add(iVar);
        iVar.configure(this);
        this.pending.remove(iVar);
        if (this.plugins.contains(iVar)) {
            return;
        }
        if (io.noties.markwon.core.a.class.isAssignableFrom(iVar.getClass())) {
            this.plugins.add(0, iVar);
        } else {
            this.plugins.add(iVar);
        }
    }

    @Nullable
    private static <P extends i> P find(@NonNull List<i> list, @NonNull Class<P> cls) {
        Iterator<i> it = list.iterator();
        while (it.hasNext()) {
            P p8 = (P) it.next();
            if (cls.isAssignableFrom(p8.getClass())) {
                return p8;
            }
        }
        return null;
    }

    @NonNull
    private <P extends i> P get(@NonNull Class<P> cls) {
        P p8 = (P) find(this.plugins, cls);
        if (p8 == null) {
            p8 = (P) find(this.origin, cls);
            if (p8 == null) {
                throw new IllegalStateException("Requested plugin is not added: " + cls.getName() + ", plugins: " + this.origin);
            }
            configure(p8);
        }
        return p8;
    }

    @NonNull
    List<i> process() {
        Iterator<i> it = this.origin.iterator();
        while (it.hasNext()) {
            configure(it.next());
        }
        return this.plugins;
    }

    @Override // io.noties.markwon.i.b
    @NonNull
    public <P extends i> P require(@NonNull Class<P> cls) {
        return (P) get(cls);
    }

    @Override // io.noties.markwon.i.b
    public <P extends i> void require(@NonNull Class<P> cls, @NonNull i.a aVar) {
        aVar.a(get(cls));
    }
}
