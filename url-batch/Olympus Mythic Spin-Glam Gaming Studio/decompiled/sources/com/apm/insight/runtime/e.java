package com.apm.insight.runtime;

import androidx.annotation.Nullable;
import com.apm.insight.entity.Header;

/* compiled from: ConfigPropGetter.java */
/* loaded from: classes5.dex */
public class e {
    private static final e b = new e() { // from class: com.apm.insight.runtime.e.1
        private Header a = null;

        @Override // com.apm.insight.runtime.e
        @Nullable
        public final Object b(String str) {
            if (this.a == null) {
                this.a = Header.b(com.apm.insight.e.g());
            }
            return this.a.f().opt(str);
        }
    };
    private e a;

    e() {
        this(b);
    }

    private e(e eVar) {
        this.a = eVar;
    }

    @Nullable
    public Object b(String str) {
        e eVar = this.a;
        if (eVar != null) {
            return eVar.b(str);
        }
        return null;
    }

    @Nullable
    public Object a(String str) {
        e eVar = this.a;
        if (eVar != null) {
            return eVar.a(str);
        }
        return null;
    }
}
