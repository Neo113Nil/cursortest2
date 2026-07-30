package io.noties.markwon;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.noties.markwon.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.commonmark.node.u;

/* loaded from: classes4.dex */
class k implements j {
    private final Map<Class<? extends u>, s> factories;

    static class a implements j.a {
        private final Map<Class<? extends u>, s> factories = new HashMap(3);

        a() {
        }

        @Override // io.noties.markwon.j.a
        @NonNull
        @Deprecated
        public <N extends u> j.a addFactory(@NonNull Class<N> cls, @NonNull s sVar) {
            return prependFactory(cls, sVar);
        }

        @Override // io.noties.markwon.j.a
        @NonNull
        public <N extends u> j.a appendFactory(@NonNull Class<N> cls, @NonNull s sVar) {
            s sVar2 = this.factories.get(cls);
            if (sVar2 == null) {
                this.factories.put(cls, sVar);
            } else if (sVar2 instanceof b) {
                ((b) sVar2).factories.add(0, sVar);
            } else {
                this.factories.put(cls, new b(sVar, sVar2));
            }
            return this;
        }

        @Override // io.noties.markwon.j.a
        @NonNull
        public j build() {
            return new k(Collections.unmodifiableMap(this.factories));
        }

        @Override // io.noties.markwon.j.a
        @Nullable
        public <N extends u> s getFactory(@NonNull Class<N> cls) {
            return this.factories.get(cls);
        }

        @Override // io.noties.markwon.j.a
        @NonNull
        public <N extends u> j.a prependFactory(@NonNull Class<N> cls, @NonNull s sVar) {
            s sVar2 = this.factories.get(cls);
            if (sVar2 == null) {
                this.factories.put(cls, sVar);
            } else if (sVar2 instanceof b) {
                ((b) sVar2).factories.add(sVar);
            } else {
                this.factories.put(cls, new b(sVar2, sVar));
            }
            return this;
        }

        @Override // io.noties.markwon.j.a
        @NonNull
        public <N extends u> s requireFactory(@NonNull Class<N> cls) {
            s factory = getFactory(cls);
            if (factory != null) {
                return factory;
            }
            throw new NullPointerException(cls.getName());
        }

        @Override // io.noties.markwon.j.a
        @NonNull
        public <N extends u> j.a setFactory(@NonNull Class<N> cls, @Nullable s sVar) {
            if (sVar == null) {
                this.factories.remove(cls);
            } else {
                this.factories.put(cls, sVar);
            }
            return this;
        }
    }

    static class b implements s {
        final List<s> factories;

        b(@NonNull s sVar, @NonNull s sVar2) {
            ArrayList arrayList = new ArrayList(3);
            this.factories = arrayList;
            arrayList.add(sVar);
            arrayList.add(sVar2);
        }

        @Override // io.noties.markwon.s
        @Nullable
        public Object getSpans(@NonNull g gVar, @NonNull q qVar) {
            int size = this.factories.size();
            Object[] objArr = new Object[size];
            for (int i8 = 0; i8 < size; i8++) {
                objArr[i8] = this.factories.get(i8).getSpans(gVar, qVar);
            }
            return objArr;
        }
    }

    k(@NonNull Map<Class<? extends u>, s> map) {
        this.factories = map;
    }

    @Override // io.noties.markwon.j
    @Nullable
    public <N extends u> s get(@NonNull Class<N> cls) {
        return this.factories.get(cls);
    }

    @Override // io.noties.markwon.j
    @NonNull
    public <N extends u> s require(@NonNull Class<N> cls) {
        s sVar = get(cls);
        if (sVar != null) {
            return sVar;
        }
        throw new NullPointerException(cls.getName());
    }
}
