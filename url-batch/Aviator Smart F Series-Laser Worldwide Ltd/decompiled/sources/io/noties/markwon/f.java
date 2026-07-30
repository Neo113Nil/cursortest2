package io.noties.markwon;

import android.content.Context;
import android.widget.TextView;
import androidx.annotation.NonNull;
import io.noties.markwon.core.b;
import io.noties.markwon.e;
import io.noties.markwon.g;
import io.noties.markwon.k;
import io.noties.markwon.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.commonmark.parser.d;

/* loaded from: classes4.dex */
class f implements e.a {
    private final Context context;
    private e.b textSetter;
    private final List<i> plugins = new ArrayList(3);
    private TextView.BufferType bufferType = TextView.BufferType.SPANNABLE;
    private boolean fallbackToRawInputWhenEmpty = true;

    f(@NonNull Context context) {
        this.context = context;
    }

    @NonNull
    private static List<i> preparePlugins(@NonNull List<i> list) {
        return new p(list).process();
    }

    @Override // io.noties.markwon.e.a
    @NonNull
    public e.a bufferType(@NonNull TextView.BufferType bufferType) {
        this.bufferType = bufferType;
        return this;
    }

    @Override // io.noties.markwon.e.a
    @NonNull
    public e build() {
        if (this.plugins.isEmpty()) {
            throw new IllegalStateException("No plugins were added to this builder. Use #usePlugin method to add them");
        }
        List<i> preparePlugins = preparePlugins(this.plugins);
        d.b bVar = new d.b();
        b.a builderWithDefaults = io.noties.markwon.core.b.builderWithDefaults(this.context);
        g.b bVar2 = new g.b();
        n.a aVar = new n.a();
        k.a aVar2 = new k.a();
        for (i iVar : preparePlugins) {
            iVar.configureParser(bVar);
            iVar.configureTheme(builderWithDefaults);
            iVar.configureConfiguration(bVar2);
            iVar.configureVisitor(aVar);
            iVar.configureSpansFactory(aVar2);
        }
        g build = bVar2.build(builderWithDefaults.build(), aVar2.build());
        return new h(this.bufferType, null, bVar.build(), m.create(aVar, build), build, Collections.unmodifiableList(preparePlugins), this.fallbackToRawInputWhenEmpty);
    }

    @Override // io.noties.markwon.e.a
    @NonNull
    public e.a fallbackToRawInputWhenEmpty(boolean z7) {
        this.fallbackToRawInputWhenEmpty = z7;
        return this;
    }

    @Override // io.noties.markwon.e.a
    @NonNull
    public e.a textSetter(@NonNull e.b bVar) {
        return this;
    }

    @Override // io.noties.markwon.e.a
    @NonNull
    public e.a usePlugin(@NonNull i iVar) {
        this.plugins.add(iVar);
        return this;
    }

    @Override // io.noties.markwon.e.a
    @NonNull
    public e.a usePlugins(@NonNull Iterable<? extends i> iterable) {
        for (i iVar : iterable) {
            iVar.getClass();
            this.plugins.add(iVar);
        }
        return this;
    }
}
