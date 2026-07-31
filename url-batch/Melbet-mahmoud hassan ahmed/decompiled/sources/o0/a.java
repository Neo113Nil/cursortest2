package o0;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.b;
import e5.a;
import java.io.File;
import java.util.ArrayList;
import m5.c;
import m5.j;
import m5.k;

/* loaded from: classes.dex */
public class a implements e5.a, k.c {

    /* renamed from: f, reason: collision with root package name */
    private Context f19642f;

    /* renamed from: g, reason: collision with root package name */
    private k f19643g;

    private void a(Context context, c cVar) {
        this.f19642f = context;
        k kVar = new k(cVar, "flutter_share");
        this.f19643g = kVar;
        kVar.e(this);
    }

    private void b(j jVar, k.d dVar) {
        try {
            String str = (String) jVar.a("title");
            String str2 = (String) jVar.a("text");
            String str3 = (String) jVar.a("linkUrl");
            String str4 = (String) jVar.a("chooserTitle");
            if (str != null && !str.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                if (str2 != null && !str2.isEmpty()) {
                    arrayList.add(str2);
                }
                if (str3 != null && !str3.isEmpty()) {
                    arrayList.add(str3);
                }
                String join = !arrayList.isEmpty() ? TextUtils.join("\n\n", arrayList) : "";
                Intent intent = new Intent();
                intent.setFlags(67108864);
                intent.setFlags(268435456);
                intent.setAction("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.SUBJECT", str);
                intent.putExtra("android.intent.extra.TEXT", join);
                Intent createChooser = Intent.createChooser(intent, str4);
                createChooser.setFlags(67108864);
                createChooser.setFlags(268435456);
                this.f19642f.startActivity(createChooser);
                dVar.a(Boolean.TRUE);
                return;
            }
            Log.println(6, "", "FlutterShare Error: Title null or empty");
            dVar.b("FlutterShare: Title cannot be null or empty", null, null);
        } catch (Exception e7) {
            Log.println(6, "", "FlutterShare: Error");
            dVar.b(e7.getMessage(), null, null);
        }
    }

    private void c(j jVar, k.d dVar) {
        try {
            String str = (String) jVar.a("title");
            String str2 = (String) jVar.a("text");
            String str3 = (String) jVar.a("filePath");
            String str4 = (String) jVar.a("fileType");
            String str5 = (String) jVar.a("chooserTitle");
            if (str3 != null && !str3.isEmpty()) {
                File file = new File(str3);
                Uri c7 = b.c(this.f19642f, this.f19642f.getApplicationContext().getPackageName() + ".provider", file);
                Intent intent = new Intent();
                intent.setFlags(67108864);
                intent.setFlags(268435456);
                intent.setAction("android.intent.action.SEND");
                intent.setType(str4);
                intent.putExtra("android.intent.extra.SUBJECT", str);
                intent.putExtra("android.intent.extra.TEXT", str2);
                intent.putExtra("android.intent.extra.STREAM", c7);
                intent.addFlags(1);
                Intent createChooser = Intent.createChooser(intent, str5);
                createChooser.setFlags(67108864);
                createChooser.setFlags(268435456);
                this.f19642f.startActivity(createChooser);
                dVar.a(Boolean.TRUE);
                return;
            }
            Log.println(6, "", "FlutterShare: ShareLocalFile Error: filePath null or empty");
            dVar.b("FlutterShare: FilePath cannot be null or empty", null, null);
        } catch (Exception e7) {
            dVar.b(e7.getMessage(), null, null);
            Log.println(6, "", "FlutterShare: Error");
        }
    }

    @Override // m5.k.c
    public void C(j jVar, k.d dVar) {
        if (jVar.f19247a.equals("shareFile")) {
            c(jVar, dVar);
        } else if (jVar.f19247a.equals("share")) {
            b(jVar, dVar);
        } else {
            dVar.c();
        }
    }

    @Override // e5.a
    public void f(a.b bVar) {
        a(bVar.a(), bVar.b());
    }

    @Override // e5.a
    public void i(a.b bVar) {
        this.f19642f = null;
        this.f19643g.e(null);
        this.f19643g = null;
    }
}
