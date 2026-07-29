package com.facebook.share.widget;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.os.EnvironmentCompat;
import com.facebook.internal.ab;
import com.facebook.internal.e;
import com.facebook.internal.g;
import com.facebook.internal.h;
import com.facebook.internal.i;
import com.facebook.internal.m;
import com.facebook.share.a;
import com.facebook.share.internal.ShareFeedContent;
import com.facebook.share.internal.f;
import com.facebook.share.internal.j;
import com.facebook.share.internal.k;
import com.facebook.share.internal.l;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideoContent;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShareDialog.java */
/* loaded from: classes.dex */
public final class e extends i<ShareContent, a.C0363a> implements com.facebook.share.a {

    /* renamed from: b, reason: collision with root package name */
    private static final int f6442b = e.b.Share.a();

    /* renamed from: c, reason: collision with root package name */
    private boolean f6443c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f6444d;

    /* compiled from: ShareDialog.java */
    public enum b {
        AUTOMATIC,
        NATIVE,
        WEB,
        FEED
    }

    public static boolean a(Class<? extends ShareContent> cls) {
        return f(cls) || e(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e(Class<? extends ShareContent> cls) {
        g g = g(cls);
        return g != null && h.a(g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean f(Class<? extends ShareContent> cls) {
        return ShareLinkContent.class.isAssignableFrom(cls) || ShareOpenGraphContent.class.isAssignableFrom(cls);
    }

    public e(Activity activity) {
        super(activity, f6442b);
        this.f6443c = false;
        this.f6444d = true;
        l.a(f6442b);
    }

    e(Activity activity, int i) {
        super(activity, i);
        this.f6443c = false;
        this.f6444d = true;
        l.a(i);
    }

    e(Fragment fragment, int i) {
        this(new m(fragment), i);
    }

    e(android.app.Fragment fragment, int i) {
        this(new m(fragment), i);
    }

    private e(m mVar, int i) {
        super(mVar, i);
        this.f6443c = false;
        this.f6444d = true;
        l.a(i);
    }

    @Override // com.facebook.internal.i
    protected void a(com.facebook.internal.e eVar, com.facebook.h<a.C0363a> hVar) {
        l.a(a(), eVar, hVar);
    }

    public boolean e() {
        return this.f6443c;
    }

    @Override // com.facebook.internal.i
    protected com.facebook.internal.a d() {
        return new com.facebook.internal.a(a());
    }

    @Override // com.facebook.internal.i
    protected List<i<ShareContent, a.C0363a>.a> c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new c());
        arrayList.add(new a());
        arrayList.add(new d());
        return arrayList;
    }

    /* compiled from: ShareDialog.java */
    private class c extends i<ShareContent, a.C0363a>.a {
        private c() {
            super();
        }

        @Override // com.facebook.internal.i.a
        public Object a() {
            return b.NATIVE;
        }

        @Override // com.facebook.internal.i.a
        public boolean a(ShareContent shareContent, boolean z) {
            boolean z2;
            if (shareContent == null) {
                return false;
            }
            if (z) {
                z2 = true;
            } else {
                z2 = shareContent.getShareHashtag() != null ? h.a(k.HASHTAG) : true;
                if ((shareContent instanceof ShareLinkContent) && !ab.a(((ShareLinkContent) shareContent).getQuote())) {
                    z2 &= h.a(k.LINK_SHARE_QUOTES);
                }
            }
            return z2 && e.e(shareContent.getClass());
        }

        @Override // com.facebook.internal.i.a
        public com.facebook.internal.a a(final ShareContent shareContent) {
            e.this.a(e.this.b(), shareContent, b.NATIVE);
            j.b(shareContent);
            final com.facebook.internal.a d2 = e.this.d();
            final boolean e = e.this.e();
            h.a(d2, new h.a() { // from class: com.facebook.share.widget.e.c.1
                @Override // com.facebook.internal.h.a
                public Bundle a() {
                    return com.facebook.share.internal.e.a(d2.c(), shareContent, e);
                }

                @Override // com.facebook.internal.h.a
                public Bundle b() {
                    return com.facebook.share.internal.c.a(d2.c(), shareContent, e);
                }
            }, e.g(shareContent.getClass()));
            return d2;
        }
    }

    /* compiled from: ShareDialog.java */
    private class d extends i<ShareContent, a.C0363a>.a {
        private d() {
            super();
        }

        @Override // com.facebook.internal.i.a
        public Object a() {
            return b.WEB;
        }

        @Override // com.facebook.internal.i.a
        public boolean a(ShareContent shareContent, boolean z) {
            return shareContent != null && e.f(shareContent.getClass());
        }

        @Override // com.facebook.internal.i.a
        public com.facebook.internal.a a(ShareContent shareContent) {
            Bundle a2;
            e.this.a(e.this.b(), shareContent, b.WEB);
            com.facebook.internal.a d2 = e.this.d();
            j.c(shareContent);
            if (shareContent instanceof ShareLinkContent) {
                a2 = com.facebook.share.internal.m.a((ShareLinkContent) shareContent);
            } else {
                a2 = com.facebook.share.internal.m.a((ShareOpenGraphContent) shareContent);
            }
            h.a(d2, b(shareContent), a2);
            return d2;
        }

        private String b(ShareContent shareContent) {
            if (shareContent instanceof ShareLinkContent) {
                return "share";
            }
            if (shareContent instanceof ShareOpenGraphContent) {
                return "share_open_graph";
            }
            return null;
        }
    }

    /* compiled from: ShareDialog.java */
    private class a extends i<ShareContent, a.C0363a>.a {
        private a() {
            super();
        }

        @Override // com.facebook.internal.i.a
        public Object a() {
            return b.FEED;
        }

        @Override // com.facebook.internal.i.a
        public boolean a(ShareContent shareContent, boolean z) {
            return (shareContent instanceof ShareLinkContent) || (shareContent instanceof ShareFeedContent);
        }

        @Override // com.facebook.internal.i.a
        public com.facebook.internal.a a(ShareContent shareContent) {
            Bundle a2;
            e.this.a(e.this.b(), shareContent, b.FEED);
            com.facebook.internal.a d2 = e.this.d();
            if (shareContent instanceof ShareLinkContent) {
                ShareLinkContent shareLinkContent = (ShareLinkContent) shareContent;
                j.c(shareLinkContent);
                a2 = com.facebook.share.internal.m.b(shareLinkContent);
            } else {
                a2 = com.facebook.share.internal.m.a((ShareFeedContent) shareContent);
            }
            h.a(d2, "feed", a2);
            return d2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static g g(Class<? extends ShareContent> cls) {
        if (ShareLinkContent.class.isAssignableFrom(cls)) {
            return k.SHARE_DIALOG;
        }
        if (SharePhotoContent.class.isAssignableFrom(cls)) {
            return k.PHOTOS;
        }
        if (ShareVideoContent.class.isAssignableFrom(cls)) {
            return k.VIDEO;
        }
        if (ShareOpenGraphContent.class.isAssignableFrom(cls)) {
            return f.OG_ACTION_DIALOG;
        }
        if (ShareMediaContent.class.isAssignableFrom(cls)) {
            return k.MULTIMEDIA;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, ShareContent shareContent, b bVar) {
        String str;
        String str2;
        if (this.f6444d) {
            bVar = b.AUTOMATIC;
        }
        switch (bVar) {
            case AUTOMATIC:
                str = "automatic";
                break;
            case WEB:
                str = "web";
                break;
            case NATIVE:
                str = TapjoyConstants.TJC_PLUGIN_NATIVE;
                break;
            default:
                str = EnvironmentCompat.MEDIA_UNKNOWN;
                break;
        }
        g g = g(shareContent.getClass());
        if (g == k.SHARE_DIALOG) {
            str2 = "status";
        } else if (g == k.PHOTOS) {
            str2 = "photo";
        } else if (g == k.VIDEO) {
            str2 = "video";
        } else {
            str2 = g == f.OG_ACTION_DIALOG ? "open_graph" : EnvironmentCompat.MEDIA_UNKNOWN;
        }
        com.facebook.appevents.f c2 = com.facebook.appevents.f.c(context);
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_show", str);
        bundle.putString("fb_share_dialog_content_type", str2);
        c2.a("fb_share_dialog_show", (Double) null, bundle);
    }
}
