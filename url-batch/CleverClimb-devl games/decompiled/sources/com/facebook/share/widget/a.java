package com.facebook.share.widget;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.internal.e;
import com.facebook.internal.g;
import com.facebook.internal.h;
import com.facebook.internal.i;
import com.facebook.share.internal.l;
import com.facebook.share.model.AppInviteContent;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AppInviteDialog.java */
/* loaded from: classes.dex */
public class a extends i<AppInviteContent, b> {

    /* renamed from: b, reason: collision with root package name */
    private static final int f6413b = e.b.AppInvite.a();

    /* compiled from: AppInviteDialog.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Bundle f6421a;

        public b(Bundle bundle) {
            this.f6421a = bundle;
        }
    }

    public static boolean e() {
        return i() || j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean i() {
        return h.a(k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j() {
        return h.b(k());
    }

    public a(Activity activity) {
        super(activity, f6413b);
    }

    @Override // com.facebook.internal.i
    protected void a(com.facebook.internal.e eVar, final com.facebook.h<b> hVar) {
        final com.facebook.share.internal.i iVar = hVar == null ? null : new com.facebook.share.internal.i(hVar) { // from class: com.facebook.share.widget.a.1
            @Override // com.facebook.share.internal.i
            public void a(com.facebook.internal.a aVar, Bundle bundle) {
                if ("cancel".equalsIgnoreCase(l.a(bundle))) {
                    hVar.a();
                } else {
                    hVar.a((com.facebook.h) new b(bundle));
                }
            }
        };
        eVar.b(a(), new e.a() { // from class: com.facebook.share.widget.a.2
            @Override // com.facebook.internal.e.a
            public boolean a(int i, Intent intent) {
                return l.a(a.this.a(), i, intent, iVar);
            }
        });
    }

    @Override // com.facebook.internal.i
    protected com.facebook.internal.a d() {
        return new com.facebook.internal.a(a());
    }

    @Override // com.facebook.internal.i
    protected List<i<AppInviteContent, b>.a> c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0364a());
        arrayList.add(new c());
        return arrayList;
    }

    /* compiled from: AppInviteDialog.java */
    /* renamed from: com.facebook.share.widget.a$a, reason: collision with other inner class name */
    private class C0364a extends i<AppInviteContent, b>.a {
        private C0364a() {
            super();
        }

        @Override // com.facebook.internal.i.a
        public boolean a(AppInviteContent appInviteContent, boolean z) {
            return a.i();
        }

        @Override // com.facebook.internal.i.a
        public com.facebook.internal.a a(final AppInviteContent appInviteContent) {
            com.facebook.internal.a d2 = a.this.d();
            h.a(d2, new h.a() { // from class: com.facebook.share.widget.a.a.1
                @Override // com.facebook.internal.h.a
                public Bundle a() {
                    return a.b(appInviteContent);
                }

                @Override // com.facebook.internal.h.a
                public Bundle b() {
                    Log.e("AppInviteDialog", "Attempting to present the AppInviteDialog with an outdated Facebook app on the device");
                    return new Bundle();
                }
            }, a.k());
            return d2;
        }
    }

    /* compiled from: AppInviteDialog.java */
    private class c extends i<AppInviteContent, b>.a {
        private c() {
            super();
        }

        @Override // com.facebook.internal.i.a
        public boolean a(AppInviteContent appInviteContent, boolean z) {
            return a.j();
        }

        @Override // com.facebook.internal.i.a
        public com.facebook.internal.a a(AppInviteContent appInviteContent) {
            com.facebook.internal.a d2 = a.this.d();
            h.a(d2, a.b(appInviteContent), a.k());
            return d2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static g k() {
        return com.facebook.share.internal.a.APP_INVITES_DIALOG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bundle b(AppInviteContent appInviteContent) {
        Bundle bundle = new Bundle();
        bundle.putString("app_link_url", appInviteContent.getApplinkUrl());
        bundle.putString("preview_image_url", appInviteContent.getPreviewImageUrl());
        String promotionCode = appInviteContent.getPromotionCode();
        if (promotionCode == null) {
            promotionCode = "";
        }
        String promotionText = appInviteContent.getPromotionText();
        if (!TextUtils.isEmpty(promotionText)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("promo_code", promotionCode);
                jSONObject.put("promo_text", promotionText);
                bundle.putString("deeplink_context", jSONObject.toString());
                bundle.putString("promo_code", promotionCode);
                bundle.putString("promo_text", promotionText);
            } catch (JSONException unused) {
                Log.e("AppInviteDialog", "Json Exception in creating deeplink context");
            }
        }
        return bundle;
    }
}
