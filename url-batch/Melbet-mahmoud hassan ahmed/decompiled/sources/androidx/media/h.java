package androidx.media;

import android.text.TextUtils;

/* loaded from: classes.dex */
class h implements f {

    /* renamed from: a, reason: collision with root package name */
    private String f1089a;

    /* renamed from: b, reason: collision with root package name */
    private int f1090b;

    /* renamed from: c, reason: collision with root package name */
    private int f1091c;

    h(String str, int i7, int i8) {
        this.f1089a = str;
        this.f1090b = i7;
        this.f1091c = i8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return (this.f1090b < 0 || hVar.f1090b < 0) ? TextUtils.equals(this.f1089a, hVar.f1089a) && this.f1091c == hVar.f1091c : TextUtils.equals(this.f1089a, hVar.f1089a) && this.f1090b == hVar.f1090b && this.f1091c == hVar.f1091c;
    }

    public int hashCode() {
        return q.d.b(this.f1089a, Integer.valueOf(this.f1091c));
    }
}
