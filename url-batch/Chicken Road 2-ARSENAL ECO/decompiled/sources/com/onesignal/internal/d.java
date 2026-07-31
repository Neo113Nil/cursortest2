package com.onesignal.internal;

/* loaded from: classes.dex */
public final class d {
    public static final a Companion = new a(null);
    private static final d DISABLED = new d(false, null);
    private final boolean isEnabled;
    private final i2.c logLevel;

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

    public d(boolean z5, i2.c cVar) {
        this.isEnabled = z5;
        this.logLevel = cVar;
    }

    public static /* synthetic */ d copy$default(d dVar, boolean z5, i2.c cVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z5 = dVar.isEnabled;
        }
        if ((i7 & 2) != 0) {
            cVar = dVar.logLevel;
        }
        return dVar.copy(z5, cVar);
    }

    public final boolean component1() {
        return this.isEnabled;
    }

    public final i2.c component2() {
        return this.logLevel;
    }

    public final d copy(boolean z5, i2.c cVar) {
        return new d(z5, cVar);
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

    public final i2.c getLogLevel() {
        return this.logLevel;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isEnabled) * 31;
        i2.c cVar = this.logLevel;
        return hashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        return "OtelConfig(isEnabled=" + this.isEnabled + ", logLevel=" + this.logLevel + ')';
    }
}
