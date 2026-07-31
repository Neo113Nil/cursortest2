package O0;

import java.util.List;
import java.util.Map;

/* renamed from: O0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0418s implements InterfaceRunnableC0421v {

    /* renamed from: b, reason: collision with root package name */
    private byte[] f1250b;

    /* renamed from: c, reason: collision with root package name */
    private String f1251c;

    /* renamed from: d, reason: collision with root package name */
    private String f1252d;

    /* renamed from: e, reason: collision with root package name */
    private String f1253e;

    /* renamed from: f, reason: collision with root package name */
    private String f1254f;

    /* renamed from: g, reason: collision with root package name */
    private List f1255g;

    public C0418s(byte[] bArr, String str, String str2, String str3, String str4, List list) {
        this.f1250b = (byte[]) bArr.clone();
        this.f1251c = str;
        this.f1252d = str2;
        this.f1254f = str3;
        this.f1253e = str4;
        this.f1255g = list;
    }

    private O a(Map map) {
        return k0.a(this.f1251c, this.f1250b, map);
    }

    private Map b() {
        return F.g(this.f1252d, this.f1254f, this.f1253e);
    }

    private void c() {
        C0405e.d().b(new C0412l(this.f1255g, this.f1252d, this.f1253e, this.f1254f));
    }

    @Override // java.lang.Runnable
    public void run() {
        j0.b("hmsSdk", "send data running");
        int b4 = a(b()).b();
        if (b4 != 200) {
            c();
            return;
        }
        j0.f("hmsSdk", "events PostRequest sendevent TYPE : %s, TAG : %s, resultCode: %d ,reqID:" + this.f1253e, this.f1254f, this.f1252d, Integer.valueOf(b4));
    }
}
