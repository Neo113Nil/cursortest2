package com.cmplay.internalpush.video;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.cmplay.base.util.w;
import com.cmplay.base.util.z;
import com.cmplay.internalpush.R;
import com.cmplay.internalpush.data.ParseCloudDataVideo;
import com.cmplay.internalpush.o;
import com.cmplay.internalpush.video.InnerPushReceiver;
import com.google.android.gms.games.GamesStatusCodes;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;

@TargetApi(14)
/* loaded from: classes.dex */
public class IncentiveVideoPlayActivity extends Activity implements TextureView.SurfaceTextureListener, View.OnClickListener, InnerPushReceiver.a {
    private static b f;
    private static boolean x;

    /* renamed from: b, reason: collision with root package name */
    private InnerPushTextureView f4334b;

    /* renamed from: c, reason: collision with root package name */
    private SurfaceTexture f4335c;

    /* renamed from: d, reason: collision with root package name */
    private a f4336d;
    private c e;
    private Timer h;
    private TimerTask i;
    private ImageView j;
    private ImageView k;
    private ImageView l;
    private ImageView m;
    private TextView n;
    private TextView o;
    private WeakReference<Bitmap> p;
    private WeakReference<Bitmap> q;
    private ProgressBar r;
    private int s;
    private int t;
    private boolean v;
    private boolean w;

    /* renamed from: a, reason: collision with root package name */
    private final String f4333a = "internal_push_VideoPlay";
    private boolean g = false;
    private boolean u = true;
    private Runnable y = new Runnable() { // from class: com.cmplay.internalpush.video.IncentiveVideoPlayActivity.1
        @Override // java.lang.Runnable
        public void run() {
            if (IncentiveVideoPlayActivity.this.e == null || IncentiveVideoPlayActivity.this.r == null) {
                return;
            }
            IncentiveVideoPlayActivity.this.s = IncentiveVideoPlayActivity.this.e.getCurrentPosition();
            IncentiveVideoPlayActivity.this.r.setProgress(IncentiveVideoPlayActivity.this.s);
            IncentiveVideoPlayActivity.this.h();
            IncentiveVideoPlayActivity.this.i();
            IncentiveVideoPlayActivity.this.r.postDelayed(IncentiveVideoPlayActivity.this.y, 200L);
        }
    };

    @Override // com.cmplay.internalpush.video.InnerPushReceiver.a
    public void b(Intent intent) {
    }

    @Override // com.cmplay.internalpush.video.InnerPushReceiver.a
    public void d(Intent intent) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public static boolean a(Context context, boolean z, String str) {
        if (context == null) {
            return false;
        }
        x = z;
        Intent intent = new Intent(context, (Class<?>) IncentiveVideoPlayActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("info_for_show", str);
        context.startActivity(intent);
        return true;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.cmplay.base.util.h.a("internal_push_VideoPlay", "onCreate");
        setContentView(R.layout.cmplay_activity_incentive_video);
        getWindow().addFlags(128);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.flags |= 1024;
        getWindow().setAttributes(attributes);
        w.a(this);
        e(getIntent());
        e();
        this.f4336d = new a();
        if (this.f4336d.e()) {
            a(0.0f, false);
        } else {
            a(d.a(this), false);
        }
        j();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        e(intent);
    }

    private void e() {
        this.e = new c();
        this.e.setAudioStreamType(3);
        this.f4334b = (InnerPushTextureView) findViewById(R.id.video_full_screen);
        this.f4334b.setSurfaceTextureListener(this);
        this.j = (ImageView) findViewById(R.id.vast_img_close_portrait);
        this.j.setOnClickListener(this);
        this.l = (ImageView) findViewById(R.id.vast_img_volume_portrait);
        this.l.setOnClickListener(this);
        this.k = (ImageView) findViewById(R.id.vast_img_close_landscape);
        this.k.setOnClickListener(this);
        this.m = (ImageView) findViewById(R.id.vast_img_volume_landscape);
        this.m.setOnClickListener(this);
        this.r = (ProgressBar) findViewById(R.id.video_full_screen_progress);
        this.o = (TextView) findViewById(R.id.learn_more_landscape);
        this.o.setOnClickListener(this);
        this.n = (TextView) findViewById(R.id.learn_more_portrait);
        this.n.setOnClickListener(this);
        if (f != null) {
            ((AspectRatioRelativeLayout) findViewById(R.id.vast_video_view_container)).setAspectRatio(f.t() / f.u());
            f();
            o.a().a(4, 9, f.e(), f.c(), "", 0, f.x(), (int) f.l());
            StringBuilder sb = new StringBuilder();
            sb.append("ParseCloudDataVideo  当前内推视频展示  @@@proId:");
            sb.append(f.c());
            sb.append("   pkgName:");
            sb.append(f.e());
            sb.append("    是否爆款：");
            sb.append(f.m());
            sb.append("   当前展示时间:");
            sb.append(com.cmplay.internalpush.a.d.a("last_show_hit_top_time" + ParseCloudDataVideo.a(this).a(), 0L));
            com.cmplay.base.util.h.a("internal_push_VideoPlay", sb.toString());
            if (x) {
                return;
            }
            com.cmplay.base.util.h.a("internal_push_VideoPlay", "sendBroadcast  onVideoShow");
            Intent intent = new Intent();
            intent.setAction("com.cmplay.libinnerpushvideo.video.Progress_notify");
            intent.putExtra("video_progress_status", 1);
            sendBroadcast(intent);
        }
    }

    private void f() {
        if (f != null) {
            setRequestedOrientation(f.t() > f.u() ? 0 : 1);
        }
        g();
        i();
        h();
    }

    private void g() {
        if (d.c(this)) {
            this.m.setVisibility(0);
            this.m.setImageResource(this.u ? R.drawable.vast_volume_off : R.drawable.vast_volume_on);
            this.l.setVisibility(8);
        } else {
            this.m.setVisibility(8);
            this.l.setVisibility(0);
            this.l.setImageResource(this.u ? R.drawable.vast_volume_off : R.drawable.vast_volume_on);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        this.k.setVisibility(8);
        this.j.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.o.setVisibility(8);
        this.n.setVisibility(8);
    }

    private void j() {
        if (e.b() == null || f == null) {
            return;
        }
        e.b().a(f.s(), new com.cmplay.base.util.c.b() { // from class: com.cmplay.internalpush.video.IncentiveVideoPlayActivity.2
            @Override // com.cmplay.base.util.c.b
            public void a(String str, String str2) {
                com.cmplay.base.util.h.a("internal_push_VideoPlay", "preloadImageForLandingPage  加载背景图片失败  errorCode:" + str2);
                IncentiveVideoPlayActivity.this.p = null;
            }

            @Override // com.cmplay.base.util.c.b
            public void a(Bitmap bitmap, String str, String str2) {
                com.cmplay.base.util.h.a("internal_push_VideoPlay", "preloadImageForLandingPage  加载背景图片成功   bitmap:" + bitmap);
                if (bitmap == null) {
                    IncentiveVideoPlayActivity.this.p = null;
                } else {
                    IncentiveVideoPlayActivity.this.p = new WeakReference(bitmap);
                }
            }
        });
        e.b().a(f.q(), new com.cmplay.base.util.c.b() { // from class: com.cmplay.internalpush.video.IncentiveVideoPlayActivity.3
            @Override // com.cmplay.base.util.c.b
            public void a(String str, String str2) {
                com.cmplay.base.util.h.a("internal_push_VideoPlay", "preloadImageForLandingPage  加载icon图片失败  errorCode:" + str2);
                IncentiveVideoPlayActivity.this.q = null;
            }

            @Override // com.cmplay.base.util.c.b
            public void a(Bitmap bitmap, String str, String str2) {
                com.cmplay.base.util.h.a("internal_push_VideoPlay", "preloadImageForLandingPage  加载icon图片成功   bitmap:" + bitmap);
                if (bitmap == null) {
                    IncentiveVideoPlayActivity.this.q = null;
                } else {
                    IncentiveVideoPlayActivity.this.q = new WeakReference(bitmap);
                }
            }
        });
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        f();
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        com.cmplay.base.util.h.a("internal_push_VideoPlay", "onStart");
        if (this.f4336d != null) {
            this.f4336d.c(true);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        com.cmplay.base.util.h.a("internal_push_VideoPlay", "onResume");
        InnerPushReceiver.a((Context) this);
        InnerPushReceiver.a((InnerPushReceiver.a) this);
        if (this.f4336d != null) {
            this.f4336d.b(false);
            k();
        }
    }

    protected void a() {
        this.v = true;
        if (this.f4335c == null) {
            com.cmplay.base.util.h.a("internal_push_VideoPlay", "play mTexture is null");
            return;
        }
        if (f == null) {
            com.cmplay.base.util.h.a("internal_push_VideoPlay", "play Model is null");
            if (!x) {
                com.cmplay.base.util.h.a("internal_push_VideoPlay", "sendBroadcast  onVideoShowFail   play Model is null");
                Intent intent = new Intent();
                intent.setAction("com.cmplay.libinnerpushvideo.video.Progress_notify");
                intent.putExtra("video_progress_status", 4);
                intent.putExtra("error_info", "play Model is null");
                sendBroadcast(intent);
            }
            finish();
            return;
        }
        try {
            this.e.reset();
            this.e.a(this.f4335c);
            this.e.setDataSource(f.r());
            this.e.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.cmplay.internalpush.video.IncentiveVideoPlayActivity.4
                @Override // android.media.MediaPlayer.OnErrorListener
                public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                    String str = "Error code: " + i + " Extra code: " + i2;
                    com.cmplay.base.util.h.a("internal_push_VideoPlay", str);
                    if (IncentiveVideoPlayActivity.x) {
                        return false;
                    }
                    com.cmplay.base.util.h.a("internal_push_VideoPlay", "sendBroadcast  onVideoShowFail  errorStr:" + str);
                    Intent intent2 = new Intent();
                    intent2.setAction("com.cmplay.libinnerpushvideo.video.Progress_notify");
                    intent2.putExtra("video_progress_status", 4);
                    intent2.putExtra("error_info", str);
                    IncentiveVideoPlayActivity.this.sendBroadcast(intent2);
                    return false;
                }
            });
            this.e.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.cmplay.internalpush.video.IncentiveVideoPlayActivity.5
                @Override // android.media.MediaPlayer.OnCompletionListener
                public void onCompletion(MediaPlayer mediaPlayer) {
                    IncentiveVideoPlayActivity.this.g = true;
                    IncentiveVideoPlayActivity.this.f4336d.a(true, IncentiveVideoPlayActivity.this.t, true);
                    com.cmplay.base.util.h.a("internal_push_VideoPlay", "onCompletion");
                    IncentiveVideoPlayActivity.this.finish();
                }
            });
            this.e.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.cmplay.internalpush.video.IncentiveVideoPlayActivity.6
                @Override // android.media.MediaPlayer.OnPreparedListener
                public void onPrepared(MediaPlayer mediaPlayer) {
                    IncentiveVideoPlayActivity.this.t = IncentiveVideoPlayActivity.this.e.getDuration();
                    com.cmplay.base.util.h.a("internal_push_VideoPlay", "mVideoLength:" + IncentiveVideoPlayActivity.this.t);
                    IncentiveVideoPlayActivity.this.r.setMax(IncentiveVideoPlayActivity.this.t);
                    IncentiveVideoPlayActivity.this.e.seekTo(IncentiveVideoPlayActivity.this.f4336d.a());
                    com.cmplay.base.util.h.a("internal_push_VideoPlay", "seekTo:" + IncentiveVideoPlayActivity.this.f4336d.a());
                    IncentiveVideoPlayActivity.this.e.start();
                    IncentiveVideoPlayActivity.this.r.post(IncentiveVideoPlayActivity.this.y);
                    IncentiveVideoPlayActivity.this.a(IncentiveVideoPlayActivity.this.t);
                }
            });
            this.e.prepare();
        } catch (Exception e) {
            e.printStackTrace();
            com.cmplay.base.util.h.a("internal_push_VideoPlay", "Exception  MediaPlayer");
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        com.cmplay.base.util.h.a("internal_push_VideoPlay", "onPause");
        InnerPushReceiver.b((InnerPushReceiver.a) this);
        InnerPushReceiver.b((Context) this);
        if (this.f4336d != null && !this.f4336d.d()) {
            b();
        }
        c();
    }

    protected void b() {
        this.v = false;
        if (this.f4336d.b()) {
            return;
        }
        this.f4336d.b(true);
        this.r.removeCallbacks(this.y);
        if (this.e != null) {
            com.cmplay.base.util.h.a("internal_push_VideoPlay", "pause: set play time =" + this.e.getCurrentPosition());
            this.f4336d.a(this.e.getCurrentPosition());
            this.e.pause();
        }
    }

    private void k() {
        com.cmplay.base.util.h.a("internal_push_VideoPlay", "resumePlay    mPlayer:" + this.e + "  mTexture:" + this.f4335c + "  mSurfaceChanged:" + this.w);
        if (this.e != null && this.f4335c != null && !this.w) {
            this.e.start();
            this.r.post(this.y);
        } else {
            com.cmplay.base.util.h.a("internal_push_VideoPlay", "resumePlay --> play");
            a();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.learn_more_portrait || id == R.id.learn_more_landscape) {
            if (f != null) {
                this.f4336d.a(this, f, (z) null);
            }
            if (x) {
                return;
            }
            com.cmplay.base.util.h.a("internal_push_VideoPlay", "sendBroadcast  onVideoClick");
            Intent intent = new Intent();
            intent.setAction("com.cmplay.libinnerpushvideo.video.Progress_notify");
            intent.putExtra("video_progress_status", 3);
            sendBroadcast(intent);
            return;
        }
        if (id == R.id.vast_img_close_portrait || id == R.id.vast_img_close_landscape) {
            finish();
        } else if (id == R.id.vast_img_volume_portrait || id == R.id.vast_img_volume_landscape) {
            a(this.u ? d.a(this) : 0.0f, d.a(this) != 0.0f);
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        com.cmplay.base.util.h.a("internal_push_VideoPlay", "onDestroy");
        if (this.e != null) {
            this.e.release();
            this.e = null;
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            return false;
        }
        if (i == 82) {
            b();
            return false;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    public void finish() {
        com.cmplay.base.util.h.a("internal_push_VideoPlay", "finish");
        if (this.f4336d != null && f != null) {
            VideoAdDetailActivity.a(this, this.f4336d, f, this.p != null ? this.p.get() : null, this.q != null ? this.q.get() : null);
            o.a().a(4, 10, f.e(), f.c(), "", 0, f.x(), (int) f.l());
        }
        x = false;
        super.finish();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        com.cmplay.base.util.h.a("internal_push_VideoPlay", "on SurfaceTextureAvailable -- >");
        this.w = this.f4335c != surfaceTexture;
        this.f4335c = surfaceTexture;
        if (this.e == null || !this.v) {
            return;
        }
        com.cmplay.base.util.h.a("internal_push_VideoPlay", "onSurfaceTextureAvailable --> play");
        a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        com.cmplay.base.util.h.a("internal_push_VideoPlay", "on onSurfaceTextureDestroyed -- >");
        this.w = true;
        this.f4335c = null;
        return false;
    }

    protected void a(float f2, boolean z) {
        this.u = f2 == 0.0f;
        this.f4336d.d(this.u);
        this.s = this.e.getCurrentPosition();
        float b2 = d.b(this);
        float f3 = b2 != 0.0f ? f2 / b2 : 0.0f;
        this.e.setVolume(f3, f3);
        g();
    }

    @Override // com.cmplay.internalpush.video.InnerPushReceiver.a
    public void a(Intent intent) {
        b();
    }

    @Override // com.cmplay.internalpush.video.InnerPushReceiver.a
    public void c(Intent intent) {
        float a2 = d.a(this);
        a(a2, !this.u && a2 == 0.0f);
    }

    private void e(Intent intent) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("info_for_show");
            com.cmplay.base.util.h.a("internal_push_VideoPlay", "parseIntent   dataJson:" + stringExtra);
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
            f = new b(stringExtra);
        }
    }

    public void a(int i) {
        com.cmplay.base.util.h.a("internal_push_VideoPlay", "startTimer");
        c();
        l();
        if (i < 0) {
            i = 0;
        }
        this.h.schedule(this.i, i + GamesStatusCodes.STATUS_ACHIEVEMENT_UNLOCK_FAILURE);
    }

    private void l() {
        if (this.h == null) {
            this.h = new Timer();
        }
        if (this.i == null) {
            this.i = new TimerTask() { // from class: com.cmplay.internalpush.video.IncentiveVideoPlayActivity.7
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    com.cmplay.base.util.h.a("internal_push_VideoPlay", "TimerTask    mIsCompletion:" + IncentiveVideoPlayActivity.this.g);
                    if (IncentiveVideoPlayActivity.this.g) {
                        return;
                    }
                    IncentiveVideoPlayActivity.this.g = true;
                    IncentiveVideoPlayActivity.this.finish();
                    com.cmplay.base.util.h.a("internal_push_VideoPlay", "TimerTask    finish()");
                }
            };
        }
    }

    public void c() {
        com.cmplay.base.util.h.a("internal_push_VideoPlay", "resetTimer()");
        if (this.h != null) {
            this.h.cancel();
            this.h = null;
        }
        if (this.i != null) {
            this.i.cancel();
            this.i = null;
        }
    }
}
