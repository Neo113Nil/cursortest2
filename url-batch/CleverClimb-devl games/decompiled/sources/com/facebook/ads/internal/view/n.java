package com.facebook.ads.internal.view;

import android.annotation.TargetApi;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.AttributeSet;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.InterstitialAdActivity;
import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.adapters.ah;
import com.facebook.ads.internal.settings.a;
import java.util.UUID;

/* loaded from: classes.dex */
public class n extends com.facebook.ads.internal.view.e.b {

    /* renamed from: b, reason: collision with root package name */
    private final String f5901b;

    /* renamed from: c, reason: collision with root package name */
    private final com.facebook.ads.internal.view.e.b.k f5902c;

    /* renamed from: d, reason: collision with root package name */
    private final com.facebook.ads.internal.view.e.b.i f5903d;
    private final com.facebook.ads.internal.view.e.b.c e;
    private final ah f;
    private com.facebook.ads.internal.m.c g;
    private com.facebook.ads.internal.view.e.c h;
    private String i;
    private Uri j;
    private String k;
    private String l;
    private String m;
    private o n;
    private NativeAd o;

    public n(Context context) {
        super(context);
        this.f5901b = UUID.randomUUID().toString();
        this.f5902c = new com.facebook.ads.internal.view.e.b.k() { // from class: com.facebook.ads.internal.view.n.1
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.j jVar) {
                if (n.this.n == null) {
                    return;
                }
                n.this.n.c();
            }
        };
        this.f5903d = new com.facebook.ads.internal.view.e.b.i() { // from class: com.facebook.ads.internal.view.n.2
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.h hVar) {
                if (n.this.n == null) {
                    return;
                }
                n.this.n.b();
            }
        };
        this.e = new com.facebook.ads.internal.view.e.b.c() { // from class: com.facebook.ads.internal.view.n.3
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.b bVar) {
                if (n.this.n == null) {
                    return;
                }
                n.this.n.h();
            }
        };
        this.f = new ah(this, context);
        s();
    }

    public n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5901b = UUID.randomUUID().toString();
        this.f5902c = new com.facebook.ads.internal.view.e.b.k() { // from class: com.facebook.ads.internal.view.n.1
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.j jVar) {
                if (n.this.n == null) {
                    return;
                }
                n.this.n.c();
            }
        };
        this.f5903d = new com.facebook.ads.internal.view.e.b.i() { // from class: com.facebook.ads.internal.view.n.2
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.h hVar) {
                if (n.this.n == null) {
                    return;
                }
                n.this.n.b();
            }
        };
        this.e = new com.facebook.ads.internal.view.e.b.c() { // from class: com.facebook.ads.internal.view.n.3
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.b bVar) {
                if (n.this.n == null) {
                    return;
                }
                n.this.n.h();
            }
        };
        this.f = new ah(this, context);
        s();
    }

    public n(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5901b = UUID.randomUUID().toString();
        this.f5902c = new com.facebook.ads.internal.view.e.b.k() { // from class: com.facebook.ads.internal.view.n.1
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.j jVar) {
                if (n.this.n == null) {
                    return;
                }
                n.this.n.c();
            }
        };
        this.f5903d = new com.facebook.ads.internal.view.e.b.i() { // from class: com.facebook.ads.internal.view.n.2
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.h hVar) {
                if (n.this.n == null) {
                    return;
                }
                n.this.n.b();
            }
        };
        this.e = new com.facebook.ads.internal.view.e.b.c() { // from class: com.facebook.ads.internal.view.n.3
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.b bVar) {
                if (n.this.n == null) {
                    return;
                }
                n.this.n.h();
            }
        };
        this.f = new ah(this, context);
        s();
    }

    @TargetApi(21)
    public n(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f5901b = UUID.randomUUID().toString();
        this.f5902c = new com.facebook.ads.internal.view.e.b.k() { // from class: com.facebook.ads.internal.view.n.1
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.j jVar) {
                if (n.this.n == null) {
                    return;
                }
                n.this.n.c();
            }
        };
        this.f5903d = new com.facebook.ads.internal.view.e.b.i() { // from class: com.facebook.ads.internal.view.n.2
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.h hVar) {
                if (n.this.n == null) {
                    return;
                }
                n.this.n.b();
            }
        };
        this.e = new com.facebook.ads.internal.view.e.b.c() { // from class: com.facebook.ads.internal.view.n.3
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.b bVar) {
                if (n.this.n == null) {
                    return;
                }
                n.this.n.h();
            }
        };
        this.f = new ah(this, context);
        s();
    }

    private void a(Intent intent) {
        if (this.i == null || this.h == null) {
            throw new IllegalStateException("Must setVideoReportUri first.");
        }
        if (this.j == null && this.l == null) {
            throw new IllegalStateException("Must setVideoURI or setVideoMPD first.");
        }
        intent.putExtra("useNativeCtaButton", this.m);
        intent.putExtra(AudienceNetworkActivity.VIEW_TYPE, a.EnumC0351a.FULL_SCREEN_VIDEO);
        intent.putExtra(AudienceNetworkActivity.VIDEO_URL, this.j.toString());
        intent.putExtra(AudienceNetworkActivity.CLIENT_TOKEN, this.k == null ? "" : this.k);
        intent.putExtra(AudienceNetworkActivity.VIDEO_MPD, this.l);
        intent.putExtra(AudienceNetworkActivity.PREDEFINED_ORIENTATION_KEY, 13);
        intent.putExtra(AudienceNetworkActivity.VIDEO_SEEK_TIME, getCurrentPosition());
        intent.putExtra(AudienceNetworkActivity.AUDIENCE_NETWORK_UNIQUE_ID_EXTRA, this.f5901b);
        intent.putExtra(AudienceNetworkActivity.VIDEO_LOGGER, this.h.g());
        intent.addFlags(268435456);
    }

    private void s() {
        getEventBus().a(this.f5902c, this.f5903d, this.e);
    }

    public void a() {
        Context context = getContext();
        Intent intent = new Intent(context, (Class<?>) AudienceNetworkActivity.class);
        a(intent);
        try {
            try {
                a(false);
                setVisibility(8);
                context.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                intent.setClass(context, InterstitialAdActivity.class);
                context.startActivity(intent);
            }
        } catch (Exception e) {
            com.facebook.ads.internal.j.b.a(com.facebook.ads.internal.j.a.a(e, "Error occurred while loading fullscreen video activity."));
        }
    }

    public void a(String str, String str2) {
        if (this.h != null) {
            this.h.a();
        }
        this.k = str2;
        this.i = str;
        this.h = (str == null || str2 == null) ? null : new com.facebook.ads.internal.view.e.c(getContext(), this.g, this, str2);
    }

    public void b() {
        if (this.o != null) {
            this.o.onCtaBroadcast();
        }
    }

    public o getListener() {
        return this.n;
    }

    public String getUniqueId() {
        return this.f5901b;
    }

    @Override // com.facebook.ads.internal.view.e.b, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f.a();
    }

    @Override // com.facebook.ads.internal.view.e.b, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f.b();
        super.onDetachedFromWindow();
    }

    public void setAdEventManager(com.facebook.ads.internal.m.c cVar) {
        this.g = cVar;
    }

    public void setEnableBackgroundVideo(boolean z) {
        this.f5647a.setBackgroundPlaybackEnabled(z);
    }

    public void setListener(o oVar) {
        this.n = oVar;
    }

    public void setNativeAd(NativeAd nativeAd) {
        this.o = nativeAd;
    }

    public void setVideoCTA(String str) {
        this.m = str;
    }

    @Override // com.facebook.ads.internal.view.e.b
    public void setVideoMPD(String str) {
        if (str != null && this.h == null) {
            throw new IllegalStateException("Must setVideoReportUri first.");
        }
        this.l = str;
        super.setVideoMPD(str);
    }

    @Override // com.facebook.ads.internal.view.e.b
    public void setVideoURI(Uri uri) {
        if (uri != null && this.h == null) {
            throw new IllegalStateException("Must setVideoReportUri first.");
        }
        this.j = uri;
        super.setVideoURI(uri);
    }
}
