package com.baidu.mapauto.auth.net;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public Integer f7743a;

    /* renamed from: b, reason: collision with root package name */
    public String f7744b;

    /* renamed from: c, reason: collision with root package name */
    public String f7745c;

    /* renamed from: d, reason: collision with root package name */
    public Exception f7746d = null;

    public final String toString() {
        StringBuilder a8 = com.baidu.mapauto.auth.b.a("NetBodyStringResponse{httpCode=");
        a8.append(this.f7743a);
        a8.append(", httpMessage='");
        a8.append(this.f7744b);
        a8.append('\'');
        a8.append(", body='");
        a8.append(this.f7745c);
        a8.append('\'');
        a8.append(", httpException=");
        a8.append(this.f7746d);
        a8.append('}');
        return a8.toString();
    }
}
