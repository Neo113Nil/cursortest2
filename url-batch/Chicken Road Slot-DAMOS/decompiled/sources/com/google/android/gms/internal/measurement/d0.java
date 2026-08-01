package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class d0 extends RuntimeException {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2210d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(Throwable th) {
        super(th);
        this.f2210d = 4;
    }

    public static d0 a(int i3, int i10, String str, String str2) {
        return new d0(c(i3, i10, str, str2), 0);
    }

    public static d0 b(int i3, String str, String str2) {
        return new d0(c(i3, i3 + 1, str, str2), 0);
    }

    public static String c(int i3, int i10, String str, String str2) {
        if (i10 < 0) {
            i10 = str2.length();
        }
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(": ");
        if (i3 > 8) {
            sb2.append("...");
            sb2.append((CharSequence) str2, i3 - 5, i3);
        } else {
            sb2.append((CharSequence) str2, 0, i3);
        }
        sb2.append('[');
        sb2.append(str2.substring(i3, i10));
        sb2.append(']');
        if (str2.length() - i10 > 8) {
            sb2.append((CharSequence) str2, i10, i10 + 5);
            sb2.append("...");
        } else {
            sb2.append((CharSequence) str2, i10, str2.length());
        }
        return sb2.toString();
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        switch (this.f2210d) {
            case 0:
                synchronized (this) {
                }
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(String str, Throwable th, int i3) {
        super(str, th);
        this.f2210d = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(String str, int i3) {
        super(str);
        this.f2210d = i3;
    }
}
