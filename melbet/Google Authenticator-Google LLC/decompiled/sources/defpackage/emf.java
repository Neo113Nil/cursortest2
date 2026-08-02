package defpackage;

import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class emf {
    public final String a;
    public final boolean b;
    public final lgv c;
    public final lew d;
    public final String e;
    public final eru f;
    public final boolean g;
    public final eoc h;
    public final boolean i;
    public final int j;
    public final Predicate k;
    public final ekd l;
    public final int m;
    public final int n;

    public emf(String str, boolean z, lgv lgvVar, lew lewVar, String str2, eru eruVar, boolean z2, int i, eoc eocVar, boolean z3, int i2, Predicate predicate, ekd ekdVar, int i3) {
        this.a = str;
        this.b = z;
        this.c = lgvVar;
        this.d = lewVar;
        this.e = str2;
        this.f = eruVar;
        this.g = z2;
        this.n = i;
        this.h = eocVar;
        this.i = z3;
        this.j = i2;
        this.k = predicate;
        this.l = ekdVar;
        this.m = i3;
    }

    public static eme a() {
        eme emeVar = new eme();
        emeVar.c(false);
        emeVar.d(false);
        emeVar.b(0);
        emeVar.g(false);
        emeVar.e(Integer.MAX_VALUE);
        emeVar.f = new eoe(1);
        return emeVar;
    }

    public final boolean equals(Object obj) {
        lew lewVar;
        String str;
        eru eruVar;
        int i;
        boolean equals;
        ekd ekdVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof emf) {
            emf emfVar = (emf) obj;
            String str2 = this.a;
            if (str2 != null ? str2.equals(emfVar.a) : emfVar.a == null) {
                if (this.b == emfVar.b && this.c.equals(emfVar.c) && ((lewVar = this.d) != null ? lewVar.equals(emfVar.d) : emfVar.d == null) && ((str = this.e) != null ? str.equals(emfVar.e) : emfVar.e == null) && ((eruVar = this.f) != null ? eruVar.equals(emfVar.f) : emfVar.f == null) && this.g == emfVar.g && ((i = this.n) != 0 ? i == emfVar.n : emfVar.n == 0)) {
                    if (this.h != null) {
                        eoc eocVar = emfVar.h;
                        throw null;
                    }
                    if (emfVar.h == null && this.i == emfVar.i && this.j == emfVar.j) {
                        equals = this.k.equals(emfVar.k);
                        if (equals && ((ekdVar = this.l) != null ? ekdVar.equals(emfVar.l) : emfVar.l == null) && this.m == emfVar.m) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        int hashCode2 = (((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
        lew lewVar = this.d;
        int hashCode3 = ((hashCode2 * 1000003) ^ (lewVar == null ? 0 : lewVar.hashCode())) * 1000003;
        String str2 = this.e;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        eru eruVar = this.f;
        int hashCode5 = (((hashCode4 ^ (eruVar == null ? 0 : eruVar.hashCode())) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003;
        int i = this.n;
        if (i == 0) {
            i = 0;
        }
        int i2 = hashCode5 ^ i;
        if (this.h != null) {
            throw null;
        }
        int i3 = ((((i2 * (-721379959)) ^ (true == this.i ? 1231 : 1237)) * 1000003) ^ this.j) * 1000003;
        hashCode = this.k.hashCode();
        int i4 = (i3 ^ hashCode) * 1000003;
        ekd ekdVar = this.l;
        return this.m ^ ((i4 ^ (ekdVar != null ? ekdVar.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        int i = this.n;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.f);
        String num = i != 0 ? Integer.toString(i - 1) : "null";
        eoc eocVar = this.h;
        Predicate predicate = this.k;
        ekd ekdVar = this.l;
        return "Metric{customEventName=" + this.a + ", isEventNameConstant=" + this.b + ", metric=" + valueOf + ", metricExtension=" + valueOf2 + ", accountableComponentName=" + this.e + ", samplingRate=" + valueOf3 + ", isUnsampled=" + this.g + ", samplingStrategy=" + num + ", activeCuiId=" + String.valueOf(eocVar) + ", shouldAttachActiveTraces=" + this.i + ", maxActiveTraces=" + this.j + ", activeTracePredicate=" + String.valueOf(predicate) + ", debugLogsTime=" + String.valueOf(ekdVar) + ", debugLogsSize=" + this.m + "}";
    }

    public emf() {
        throw null;
    }
}
