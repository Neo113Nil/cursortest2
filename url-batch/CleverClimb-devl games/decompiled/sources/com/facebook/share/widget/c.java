package com.facebook.share.widget;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.facebook.internal.e;
import com.facebook.internal.g;
import com.facebook.internal.h;
import com.facebook.internal.i;
import com.facebook.internal.m;
import com.facebook.share.a;
import com.facebook.share.internal.j;
import com.facebook.share.internal.l;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideoContent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MessageDialog.java */
/* loaded from: classes.dex */
public final class c extends i<ShareContent, a.C0363a> implements com.facebook.share.a {

    /* renamed from: b, reason: collision with root package name */
    private static final int f6431b = e.b.Message.a();

    /* renamed from: c, reason: collision with root package name */
    private boolean f6432c;

    public static boolean a(Class<? extends ShareContent> cls) {
        g c2 = c(cls);
        return c2 != null && h.a(c2);
    }

    public c(Activity activity) {
        super(activity, f6431b);
        this.f6432c = false;
        l.a(f6431b);
    }

    c(Activity activity, int i) {
        super(activity, i);
        this.f6432c = false;
        l.a(i);
    }

    c(Fragment fragment, int i) {
        this(new m(fragment), i);
    }

    c(android.app.Fragment fragment, int i) {
        this(new m(fragment), i);
    }

    private c(m mVar, int i) {
        super(mVar, i);
        this.f6432c = false;
        l.a(i);
    }

    @Override // com.facebook.internal.i
    protected void a(com.facebook.internal.e eVar, com.facebook.h<a.C0363a> hVar) {
        l.a(a(), eVar, hVar);
    }

    public boolean e() {
        return this.f6432c;
    }

    @Override // com.facebook.internal.i
    protected com.facebook.internal.a d() {
        return new com.facebook.internal.a(a());
    }

    @Override // com.facebook.internal.i
    protected List<i<ShareContent, a.C0363a>.a> c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a());
        return arrayList;
    }

    /* compiled from: MessageDialog.java */
    private class a extends i<ShareContent, a.C0363a>.a {
        private a() {
            super();
        }

        @Override // com.facebook.internal.i.a
        public boolean a(ShareContent shareContent, boolean z) {
            return shareContent != null && c.a((Class<? extends ShareContent>) shareContent.getClass());
        }

        @Override // com.facebook.internal.i.a
        public com.facebook.internal.a a(final ShareContent shareContent) {
            j.a(shareContent);
            final com.facebook.internal.a d2 = c.this.d();
            final boolean e = c.this.e();
            c.this.b();
            h.a(d2, new h.a() { // from class: com.facebook.share.widget.c.a.1
                @Override // com.facebook.internal.h.a
                public Bundle a() {
                    return com.facebook.share.internal.e.a(d2.c(), shareContent, e);
                }

                @Override // com.facebook.internal.h.a
                public Bundle b() {
                    return com.facebook.share.internal.c.a(d2.c(), shareContent, e);
                }
            }, c.c(shareContent.getClass()));
            return d2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static g c(Class<? extends ShareContent> cls) {
        if (ShareLinkContent.class.isAssignableFrom(cls)) {
            return com.facebook.share.internal.d.MESSAGE_DIALOG;
        }
        if (SharePhotoContent.class.isAssignableFrom(cls)) {
            return com.facebook.share.internal.d.PHOTOS;
        }
        if (ShareVideoContent.class.isAssignableFrom(cls)) {
            return com.facebook.share.internal.d.VIDEO;
        }
        if (ShareOpenGraphContent.class.isAssignableFrom(cls)) {
            return com.facebook.share.internal.h.OG_MESSAGE_DIALOG;
        }
        return null;
    }
}
