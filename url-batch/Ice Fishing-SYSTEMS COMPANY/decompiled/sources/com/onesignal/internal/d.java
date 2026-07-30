package com.onesignal.internal;

/* loaded from: classes2.dex */
public final class d {
    public static final a Companion = new a(null);
    private static final d DISABLED = new d(false, null);
    private final boolean isEnabled;
    private final I4.c logLevel;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final d getDISABLED() {
            return d.DISABLED;
        }

        private a() {
        }
    }

    public d(boolean z8, I4.c cVar) {
        this.isEnabled = z8;
        this.logLevel = cVar;
    }

    public static /* synthetic */ d copy$default(d dVar, boolean z8, I4.c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z8 = dVar.isEnabled;
        }
        if ((i & 2) != 0) {
            cVar = dVar.logLevel;
        }
        return dVar.copy(z8, cVar);
    }

    public final boolean component1() {
        return this.isEnabled;
    }

    public final I4.c component2() {
        return this.logLevel;
    }

    public final d copy(boolean z8, I4.c cVar) {
        return new d(z8, cVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.isEnabled == dVar.isEnabled && this.logLevel == dVar.logLevel;
    }

    public final I4.c getLogLevel() {
        return this.logLevel;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isEnabled) * 31;
        I4.c cVar = this.logLevel;
        return hashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        return "OtelConfig(isEnabled=" + this.isEnabled + ", logLevel=" + this.logLevel + ')';
    }
}
