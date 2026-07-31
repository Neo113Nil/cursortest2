package com.ironsource;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.uc;
import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class wc {

    /* renamed from: a, reason: collision with root package name */
    private final Context f20182a;

    /* renamed from: b, reason: collision with root package name */
    private final gb f20183b;

    /* renamed from: c, reason: collision with root package name */
    private final vc f20184c;

    /* renamed from: d, reason: collision with root package name */
    private final qm f20185d;

    /* renamed from: e, reason: collision with root package name */
    private final of f20186e = nm.S().f();

    class a implements qo {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ qo f20187a;

        /* renamed from: com.ironsource.wc$a$a, reason: collision with other inner class name */
        class C0168a extends JSONObject {
            C0168a() {
                put("lastReferencedTime", System.currentTimeMillis());
            }
        }

        a(qo qoVar) {
            this.f20187a = qoVar;
        }

        @Override // com.ironsource.qo
        public void a(oh ohVar) {
            this.f20187a.a(ohVar);
            try {
                wc.this.f20185d.a(ohVar.getName(), new C0168a());
            } catch (Exception e4) {
                o9.d().a(e4);
                IronLog.INTERNAL.error(e4.toString());
            }
        }

        @Override // com.ironsource.qo
        public void a(oh ohVar, gh ghVar) {
            this.f20187a.a(ohVar, ghVar);
        }
    }

    public wc(Context context, gb gbVar, vc vcVar, qm qmVar) {
        this.f20182a = context;
        this.f20183b = gbVar;
        this.f20184c = vcVar;
        this.f20185d = qmVar;
    }

    public void b(oh ohVar) {
        if (ohVar.exists()) {
            ArrayList<oh> filesInFolderRecursive = IronSourceStorageUtils.getFilesInFolderRecursive(ohVar);
            if (!IronSourceStorageUtils.deleteFolderContentRecursive(ohVar) || !ohVar.delete()) {
                throw new Exception("Failed to delete folder");
            }
            this.f20185d.a(filesInFolderRecursive);
        }
    }

    public JSONObject c(oh ohVar) {
        if (ohVar.exists()) {
            return IronSourceStorageUtils.buildFilesMapOfDirectory(ohVar, this.f20185d.b());
        }
        throw new Exception("Folder does not exist");
    }

    public long d(oh ohVar) {
        if (ohVar.exists()) {
            return IronSourceStorageUtils.getTotalSizeOfDir(ohVar);
        }
        throw new Exception("Folder does not exist");
    }

    public void a(oh ohVar) {
        if (ohVar.exists()) {
            if (!ohVar.delete()) {
                throw new Exception("Failed to delete file");
            }
            this.f20185d.a(ohVar.getName());
        }
    }

    public void a(oh ohVar, String str, int i4, int i5, qo qoVar) {
        if (TextUtils.isEmpty(str)) {
            throw new Exception(uc.a.f19899a);
        }
        if (this.f20186e.a(this.f20183b.a()) <= 0) {
            throw new Exception(d9.f15832A);
        }
        if (!x8.h(this.f20182a)) {
            throw new Exception(d9.f15834C);
        }
        this.f20184c.a(ohVar.getPath(), new a(qoVar));
        if (!ohVar.exists()) {
            this.f20183b.a(ohVar, str, i4, i5, this.f20184c);
            return;
        }
        Message message = new Message();
        message.obj = ohVar;
        message.what = 1015;
        this.f20184c.sendMessage(message);
    }

    public void a(oh ohVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            throw new Exception("Missing attributes to update");
        }
        if (!ohVar.exists()) {
            throw new Exception("File does not exist");
        }
        if (!this.f20185d.b(ohVar.getName(), jSONObject)) {
            throw new Exception("Failed to update attribute");
        }
    }
}
