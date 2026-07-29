package com.cmplay.b.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.cmplay.b.f;
import com.cmplay.b.g;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.e;
import com.facebook.h;
import com.facebook.j;
import com.facebook.l;
import com.facebook.q;
import com.facebook.share.model.AppInviteContent;
import com.facebook.share.model.GameRequestContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import java.io.File;
import org.json.JSONObject;

/* compiled from: FaceBookPlatform.java */
/* loaded from: classes.dex */
public class b extends c implements com.cmplay.b.d {

    /* renamed from: c, reason: collision with root package name */
    private int f3905c;

    /* renamed from: d, reason: collision with root package name */
    private int f3906d;
    private e e;
    private int f;
    private int g;
    private int h;
    private InterfaceC0320b i;
    private f j;
    private String k;
    private int l;
    private int m;
    private int n;

    /* compiled from: FaceBookPlatform.java */
    /* renamed from: com.cmplay.b.a.b$b, reason: collision with other inner class name */
    public interface InterfaceC0320b {
        void a(String str);

        void a(boolean z, String str, String str2);
    }

    static /* synthetic */ int g(b bVar) {
        int i = bVar.f3905c;
        bVar.f3905c = i + 1;
        return i;
    }

    public b(Activity activity, int i) {
        this(activity, i == 3 ? com.cmplay.b.a.Messenger : com.cmplay.b.a.Facebook, i);
    }

    b(Context context, com.cmplay.b.a aVar, int i) {
        super(context, aVar);
        this.f3905c = 0;
        this.f = 0;
        this.g = 1;
        this.h = 2;
        l.a(context.getApplicationContext());
        this.f3905c = 0;
        this.f3906d = i;
        this.e = e.a.a();
    }

    @Override // com.cmplay.b.a.c
    public void a(f fVar) {
        this.j = fVar;
        this.k = com.cmplay.b.b.a(this.j.g());
        this.l = com.cmplay.b.b.b(this.j.g());
        this.n = com.cmplay.b.b.d();
        this.m = com.cmplay.b.b.a(this.j.g(), this.j.f());
        switch (this.f3906d) {
            case 1:
                c(fVar);
                break;
            case 2:
                switch (fVar.h()) {
                    case 1:
                        d(fVar);
                        break;
                    case 2:
                        e(fVar);
                        break;
                }
            case 3:
                switch (fVar.h()) {
                    case 1:
                        f(fVar);
                        break;
                    case 2:
                        g(fVar);
                        break;
                }
            case 4:
                b(fVar);
                break;
        }
    }

    private void c(f fVar) {
        this.j = fVar;
        this.k = com.cmplay.b.b.a(this.j.g());
        this.l = com.cmplay.b.b.b(this.j.g());
        this.n = com.cmplay.b.b.d();
        this.m = com.cmplay.b.b.a(this.j.g(), this.j.f());
        String a2 = com.cmplay.b.b.a(fVar.g());
        com.cmplay.b.b.a().a("clk_fb_invite");
        com.cmplay.b.b.a().a("clk_fb_invite" + a2);
        g.a().a(this.l, this.n, this.m, 2);
        if (com.facebook.share.widget.a.e()) {
            AppInviteContent a3 = new AppInviteContent.a().a("https://fb.me/1349730065100423").b("http://board.cmcm.com/beta/tmp/006.jpg").a();
            com.facebook.share.widget.a aVar = new com.facebook.share.widget.a((Activity) this.f3912b);
            this.f = aVar.a();
            aVar.a(this.e, (h) new a(this, null));
            aVar.b((com.facebook.share.widget.a) a3);
        }
    }

    private void d(f fVar) {
        this.j = fVar;
        this.k = com.cmplay.b.b.a(this.j.g());
        this.l = com.cmplay.b.b.b(this.j.g());
        this.n = com.cmplay.b.b.d();
        this.m = com.cmplay.b.b.a(this.j.g(), this.j.f());
        String a2 = com.cmplay.b.b.a(fVar.g());
        com.cmplay.b.b.a().a("clk_fb_timeline");
        com.cmplay.b.b.a().a("clk_fb_timeline" + a2);
        g.a().a(this.l, this.n, this.m, 2);
        if (com.facebook.share.widget.e.a((Class<? extends ShareContent>) ShareLinkContent.class)) {
            ShareLinkContent a3 = new ShareLinkContent.a().b(fVar.d()).a(fVar.b()).a(Uri.parse(fVar.a())).b(Uri.parse(fVar.e())).a();
            com.facebook.share.widget.e eVar = new com.facebook.share.widget.e((Activity) this.f3912b);
            this.g = eVar.a();
            eVar.a(this.e, (h) new a(this, null));
            eVar.b((com.facebook.share.widget.e) a3);
        }
    }

    private void e(f fVar) {
        Uri uri;
        this.j = fVar;
        this.k = com.cmplay.b.b.a(this.j.g());
        this.l = com.cmplay.b.b.b(this.j.g());
        this.n = com.cmplay.b.b.d();
        this.m = com.cmplay.b.b.a(this.j.g(), this.j.f());
        String a2 = com.cmplay.b.b.a(fVar.g());
        com.cmplay.b.b.a().a("clk_fb_timeline");
        com.cmplay.b.b.a().a("clk_fb_timeline" + a2);
        g.a().a(this.l, this.n, this.m, 2);
        if (com.facebook.share.widget.e.a((Class<? extends ShareContent>) SharePhotoContent.class)) {
            AnonymousClass1 anonymousClass1 = null;
            try {
                uri = Uri.fromFile(new File(fVar.c()));
            } catch (Exception unused) {
                uri = null;
            }
            SharePhotoContent a3 = new SharePhotoContent.a().a(new SharePhoto.a().a(uri).c()).a();
            com.facebook.share.widget.e eVar = new com.facebook.share.widget.e((Activity) this.f3912b);
            this.g = eVar.a();
            eVar.a(this.e, (h) new a(this, anonymousClass1));
            eVar.b((com.facebook.share.widget.e) a3);
        }
    }

    private void f(f fVar) {
        this.j = fVar;
        this.k = com.cmplay.b.b.a(this.j.g());
        this.l = com.cmplay.b.b.b(this.j.g());
        this.n = com.cmplay.b.b.d();
        this.m = com.cmplay.b.b.a(this.j.g(), this.j.f());
        String a2 = com.cmplay.b.b.a(fVar.g());
        com.cmplay.b.b.a().a("clk_fb_messenger");
        com.cmplay.b.b.a().a("clk_fb_messenger" + a2);
        g.a().a(this.l, this.n, this.m, 2);
        if (com.facebook.share.widget.c.a((Class<? extends ShareContent>) ShareLinkContent.class)) {
            ShareLinkContent a3 = new ShareLinkContent.a().b(fVar.d()).a(fVar.b()).a(Uri.parse(fVar.a())).b(Uri.parse("http://board.cmcm.com/beta/tmp/005.png")).a();
            com.facebook.share.widget.c cVar = new com.facebook.share.widget.c((Activity) this.f3912b);
            this.h = cVar.a();
            cVar.a(this.e, (h) new a(this, null));
            cVar.b((com.facebook.share.widget.c) a3);
        }
    }

    private void g(f fVar) {
        Uri uri;
        this.j = fVar;
        this.k = com.cmplay.b.b.a(this.j.g());
        this.l = com.cmplay.b.b.b(this.j.g());
        this.n = com.cmplay.b.b.d();
        this.m = com.cmplay.b.b.a(this.j.g(), this.j.f());
        String a2 = com.cmplay.b.b.a(fVar.g());
        com.cmplay.b.b.a().a("clk_fb_messenger");
        com.cmplay.b.b.a().a("clk_fb_messenger" + a2);
        g.a().a(this.l, this.n, this.m, 2);
        if (com.facebook.share.widget.c.a((Class<? extends ShareContent>) SharePhotoContent.class)) {
            AnonymousClass1 anonymousClass1 = null;
            try {
                uri = Uri.fromFile(new File(fVar.c()));
            } catch (Exception unused) {
                uri = null;
            }
            SharePhotoContent a3 = new SharePhotoContent.a().a(new SharePhoto.a().a(uri).c()).a();
            com.facebook.share.widget.c cVar = new com.facebook.share.widget.c((Activity) this.f3912b);
            this.h = cVar.a();
            cVar.a(this.e, (h) new a(this, anonymousClass1));
            cVar.b((com.facebook.share.widget.c) a3);
        }
    }

    public void b(f fVar) {
        this.j = fVar;
        this.k = com.cmplay.b.b.a(this.j.g());
        this.l = com.cmplay.b.b.b(this.j.g());
        this.n = com.cmplay.b.b.d();
        this.m = com.cmplay.b.b.a(this.j.g(), this.j.f());
        String a2 = com.cmplay.b.b.a(fVar.g());
        com.cmplay.b.b.a().a("clk_fb_game_req");
        com.cmplay.b.b.a().a("clk_fb_game_req" + a2);
        g.a().a(this.l, this.n, this.m, 2);
        new com.facebook.share.widget.b((Activity) this.f3912b).a(this.e, (h) new a(this, null));
        com.facebook.share.widget.b.a((Activity) this.f3912b, new GameRequestContent.b().c(fVar.d()).a(fVar.b()).b(fVar.i()).a());
    }

    @Override // com.cmplay.b.d
    public void a(int i, int i2, Intent intent) {
        this.e.a(i, i2, intent);
        if (this.f == i) {
            com.cmplay.b.b.a().a("at_fb_invite_req");
        } else if (this.g == i) {
            com.cmplay.b.b.a().a("at_fb_timeline_req");
        } else if (this.h == i) {
            com.cmplay.b.b.a().a("at_fb_messenger_req");
        }
    }

    /* compiled from: FaceBookPlatform.java */
    private class a<RESULT> implements h<RESULT> {
        private a() {
        }

        /* synthetic */ a(b bVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.facebook.h
        public void a(RESULT result) {
            com.cmplay.b.b.a().a(a(1));
            com.cmplay.b.b.a().a(a(1) + b.this.k);
            if (9 != b.this.j.f()) {
                g.a().a(b.this.l, b.this.n, b.this.m, 3);
                b.this.a(b(), 1);
            }
            g.a().b(b.this);
            b.this.b();
        }

        @Override // com.facebook.h
        public void a() {
            com.cmplay.b.b.a().a(a(2));
            com.cmplay.b.b.a().a(a(2) + b.this.k);
            if (9 != b.this.j.f()) {
                g.a().a(b.this.l, b.this.n, b.this.m, 5);
                b.this.a(b(), 2);
            }
            g.a().b(b.this);
            b.this.b();
        }

        @Override // com.facebook.h
        public void a(j jVar) {
            if (b.this.f3905c < 1) {
                b.this.a(b.this.j);
                b.g(b.this);
                return;
            }
            com.cmplay.b.b.a().a(a(3));
            com.cmplay.b.b.a().a(a(3) + b.this.k);
            if (9 != b.this.j.f()) {
                g.a().a(b.this.l, b.this.n, b.this.m, 4);
                b.this.a(b(), 0);
            }
            g.a().b(b.this);
            b.this.b();
        }

        private String a(int i) {
            switch (i) {
                case 1:
                    switch (b.this.f3906d) {
                        case 1:
                            return "at_fb_invite_success";
                        case 2:
                            return "at_fb_timeline_success";
                        case 3:
                            return "at_fb_messenger_success";
                        case 4:
                            return "at_fb_game_req_success";
                        default:
                            return "unknow";
                    }
                case 2:
                    switch (b.this.f3906d) {
                        case 1:
                            return "at_fb_invite_cancel";
                        case 2:
                            return "at_fb_timeline_cancel";
                        case 3:
                            return "at_fb_messenger_cancel";
                        case 4:
                            return "at_fb_game_req_cancel";
                        default:
                            return "unknow";
                    }
                case 3:
                    switch (b.this.f3906d) {
                        case 1:
                            return "at_fb_invite_faild";
                        case 2:
                            return "at_fb_timeline_faild";
                        case 3:
                            return "at_fb_messenger_faild";
                        case 4:
                            return "at_fb_game_req_faild";
                        default:
                            return "unknow";
                    }
                default:
                    return "unknow";
            }
        }

        private int b() {
            switch (b.this.f3906d) {
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 9;
                default:
                    return -1;
            }
        }
    }

    /* compiled from: FaceBookPlatform.java */
    /* renamed from: com.cmplay.b.a.b$1, reason: invalid class name */
    class AnonymousClass1 implements h<com.facebook.login.g> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f3907a;

        @Override // com.facebook.h
        public void a(com.facebook.login.g gVar) {
            AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
            if (currentAccessToken != null) {
                final String str = "https://graph.facebook.com/me/picture?access_token=" + currentAccessToken.getToken() + "&type=large";
                GraphRequest.b(GraphRequest.a(currentAccessToken, new GraphRequest.c() { // from class: com.cmplay.b.a.b.1.1
                    @Override // com.facebook.GraphRequest.c
                    public void a(JSONObject jSONObject, q qVar) {
                        if (jSONObject == null || AnonymousClass1.this.f3907a.i == null) {
                            return;
                        }
                        AnonymousClass1.this.f3907a.i.a(true, jSONObject.optString("name"), str);
                    }
                }));
            }
        }

        @Override // com.facebook.h
        public void a() {
            if (this.f3907a.i != null) {
                this.f3907a.i.a(false, null, null);
            }
        }

        @Override // com.facebook.h
        public void a(j jVar) {
            if (this.f3907a.i != null) {
                this.f3907a.i.a(jVar.toString());
            }
        }
    }
}
