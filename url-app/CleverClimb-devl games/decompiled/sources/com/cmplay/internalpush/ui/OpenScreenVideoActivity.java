package com.cmplay.internalpush.ui;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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
import com.c.a.g;
import com.c.a.i;
import com.cmplay.base.util.h;
import com.cmplay.internalpush.R;
import com.cmplay.internalpush.data.f;
import com.cmplay.internalpush.n;
import com.cmplay.internalpush.o;
import com.cmplay.internalpush.video.AspectRatioRelativeLayout;
import com.cmplay.internalpush.video.InnerPushReceiver;
import com.cmplay.internalpush.video.InnerPushTextureView;
import com.cmplay.internalpush.video.a;
import com.cmplay.internalpush.video.c;
import com.cmplay.internalpush.video.d;
import com.google.android.gms.games.GamesStatusCodes;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

@TargetApi(14)
/* loaded from: classes.dex */
public class OpenScreenVideoActivity extends Activity implements TextureView.SurfaceTextureListener, View.OnClickListener, InnerPushReceiver.a {

    /* renamed from: b, reason: collision with root package name */
    private InnerPushTextureView f4312b;

    /* renamed from: c, reason: collision with root package name */
    private SurfaceTexture f4313c;

    /* renamed from: d, reason: collision with root package name */
    private a f4314d;
    private c e;
    private f f;
    private Timer j;
    private TimerTask k;
    private ProgressBar l;
    private ImageView o;
    private TextView q;
    private ImageView r;
    private int u;
    private int v;
    private boolean x;
    private boolean y;
    private g z;

    /* renamed from: a, reason: collision with root package name */
    private final String f4311a = "internal_push_open_Video";
    private Bitmap g = null;
    private Bitmap h = null;
    private boolean i = false;
    private ImageView m = null;
    private ImageView n = null;
    private ImageView p = null;
    private ImageView s = null;
    private Bitmap t = null;
    private boolean w = true;
    private Runnable A = new Runnable() { // from class: com.cmplay.internalpush.ui.OpenScreenVideoActivity.1
        @Override // java.lang.Runnable
        public void run() {
            if (OpenScreenVideoActivity.this.e == null || OpenScreenVideoActivity.this.l == null) {
                return;
            }
            OpenScreenVideoActivity.this.u = OpenScreenVideoActivity.this.e.getCurrentPosition();
            OpenScreenVideoActivity.this.l.setProgress(OpenScreenVideoActivity.this.u);
            OpenScreenVideoActivity.this.l.postDelayed(OpenScreenVideoActivity.this.A, 200L);
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

    public static boolean a(Context context, String str) {
        if (context == null) {
            return false;
        }
        Intent intent = new Intent(context, (Class<?>) OpenScreenVideoActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("info_for_show", str);
        context.startActivity(intent);
        return true;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        h.a("internal_push_open_Video", "onCreate");
        e(getIntent());
        int i = R.layout.cmplay_activity_open_screen_video;
        if (this.f != null) {
            i = b(this.f.h());
        }
        setContentView(i);
        getWindow().addFlags(128);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.flags |= 1024;
        getWindow().setAttributes(attributes);
        e();
        this.f4314d = new a();
        if (this.f4314d.e()) {
            a(0.0f, false);
        } else {
            a(d.a(this), false);
        }
    }

    private int b(int i) {
        h.a("internal_push", "getLayoutIdByDisplayType displayType:" + i);
        if (i == 12) {
            return R.layout.cmplay_activity_open_screen_video_land;
        }
        return R.layout.cmplay_activity_open_screen_video;
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        e(intent);
    }

    private void e() {
        this.e = new c();
        this.e.setAudioStreamType(3);
        this.f4312b = (InnerPushTextureView) findViewById(R.id.video_full_screen);
        this.f4312b.setSurfaceTextureListener(this);
        this.s = (ImageView) findViewById(R.id.video_image);
        this.l = (ProgressBar) findViewById(R.id.video_full_screen_progress);
        this.n = (ImageView) findViewById(R.id.try_btn);
        this.n.setOnClickListener(this);
        this.m = (ImageView) findViewById(R.id.close_btn);
        this.m.setOnClickListener(this);
        this.o = (ImageView) findViewById(R.id.btn_play);
        this.o.setVisibility(8);
        this.o.setOnClickListener(this);
        this.p = (ImageView) findViewById(R.id.ad_tag);
        this.q = (TextView) findViewById(R.id.tv_title);
        this.r = (ImageView) findViewById(R.id.iv_icon);
        if (this.f != null) {
            ((AspectRatioRelativeLayout) findViewById(R.id.vast_video_view_container)).setAspectRatio(1.0f);
            f();
            this.p.setVisibility(this.f.u() ? 0 : 8);
            if (!TextUtils.isEmpty(this.f.q())) {
                this.t = BitmapFactory.decodeFile(this.f.q());
                if (this.t != null) {
                    this.s.setImageBitmap(this.t);
                }
            }
            if (!TextUtils.isEmpty(this.f.o())) {
                this.g = BitmapFactory.decodeFile(this.f.o());
                if (this.g != null) {
                    this.r.setImageBitmap(this.g);
                }
            }
            if (!TextUtils.isEmpty(this.f.r())) {
                this.h = BitmapFactory.decodeFile(this.f.r());
                if (this.h != null) {
                    this.n.setImageBitmap(this.h);
                    if (this.f.a()) {
                        a(this.n, 1000);
                    }
                }
            }
            this.q.setText(this.f.p());
            o.a().a(1, 9, this.f.e(), this.f.c(), "", n.a().b(), 0, this.f.l());
        }
    }

    @SuppressLint({"NewApi"})
    public void a(View view, int i) {
        this.z = g.a(view, i.a("scaleX", 1.0f, 0.7f, 1.0f), i.a("scaleY", 1.0f, 0.7f, 1.0f), i.a("alpha", 1.0f, 0.5f, 1.0f));
        this.z.a(-1);
        this.z.b(-1);
        this.z.b(i);
        this.z.a();
    }

    private void f() {
        if (this.f != null) {
            setRequestedOrientation(12 == this.f.h() ? 0 : 1);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        f();
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        h.a("internal_push_open_Video", "onStart");
        if (this.f4314d != null) {
            this.f4314d.c(true);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        h.a("internal_push_open_Video", "onResume");
        InnerPushReceiver.a((Context) this);
        InnerPushReceiver.a((InnerPushReceiver.a) this);
        if (this.f4314d != null) {
            this.f4314d.b(false);
            g();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void a() {
        FileInputStream fileInputStream;
        Throwable th;
        Exception e;
        this.x = true;
        if (this.f4313c == null) {
            h.a("internal_push_open_Video", "play mTexture is null");
            return;
        }
        if (this.f == null) {
            h.a("internal_push_open_Video", "play Model is null");
            return;
        }
        try {
            try {
                this.e.reset();
                this.e.a(this.f4313c);
                fileInputStream = new FileInputStream(this.f.v());
                try {
                    this.e.setDataSource(fileInputStream.getFD());
                    this.e.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.cmplay.internalpush.ui.OpenScreenVideoActivity.2
                        @Override // android.media.MediaPlayer.OnErrorListener
                        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                            h.a("internal_push_open_Video", "Error code: " + i + " Extra code: " + i2);
                            return false;
                        }
                    });
                    this.e.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.cmplay.internalpush.ui.OpenScreenVideoActivity.3
                        @Override // android.media.MediaPlayer.OnCompletionListener
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            OpenScreenVideoActivity.this.i = true;
                            OpenScreenVideoActivity.this.f4314d.a(true, OpenScreenVideoActivity.this.v, true);
                            h.a("internal_push_open_Video", "onCompletion");
                            OpenScreenVideoActivity.this.o.setVisibility(0);
                            OpenScreenVideoActivity.this.s.setVisibility(0);
                        }
                    });
                    this.e.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.cmplay.internalpush.ui.OpenScreenVideoActivity.4
                        @Override // android.media.MediaPlayer.OnPreparedListener
                        public void onPrepared(MediaPlayer mediaPlayer) {
                            OpenScreenVideoActivity.this.v = OpenScreenVideoActivity.this.e.getDuration();
                            h.a("internal_push_open_Video", "mVideoLength:" + OpenScreenVideoActivity.this.v);
                            OpenScreenVideoActivity.this.l.setMax(OpenScreenVideoActivity.this.v);
                            OpenScreenVideoActivity.this.e.seekTo(OpenScreenVideoActivity.this.f4314d.a());
                            h.a("internal_push_open_Video", "seekTo:" + OpenScreenVideoActivity.this.f4314d.a());
                            OpenScreenVideoActivity.this.o.setVisibility(0);
                            OpenScreenVideoActivity.this.s.setVisibility(0);
                            OpenScreenVideoActivity.this.l.post(OpenScreenVideoActivity.this.A);
                        }
                    });
                    this.e.prepare();
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    h.a("internal_push_open_Video", "Exception  MediaPlayer");
                    if (fileInputStream == null) {
                        return;
                    }
                    fileInputStream.close();
                }
            } catch (Throwable th2) {
                th = th2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        } catch (Exception e3) {
            fileInputStream = null;
            e = e3;
        } catch (Throwable th3) {
            fileInputStream = null;
            th = th3;
            if (fileInputStream != null) {
            }
            throw th;
        }
        try {
            fileInputStream.close();
        } catch (IOException unused2) {
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        h.a("internal_push_open_Video", "onPause");
        InnerPushReceiver.b((InnerPushReceiver.a) this);
        InnerPushReceiver.b((Context) this);
        if (this.f4314d == null || this.f4314d.d()) {
            return;
        }
        b();
    }

    protected void b() {
        this.x = false;
        if (this.f4314d.b()) {
            return;
        }
        this.f4314d.b(true);
        this.l.removeCallbacks(this.A);
        if (this.e != null) {
            h.a("internal_push_open_Video", "pause: set play time =" + this.e.getCurrentPosition());
            this.f4314d.a(this.e.getCurrentPosition());
            this.e.pause();
        }
    }

    private void g() {
        h.a("internal_push_open_Video", "resumePlay    mPlayer:" + this.e + "  mTexture:" + this.f4313c + "  mSurfaceChanged:" + this.y);
        if (this.e != null && this.f4313c != null && !this.y) {
            this.e.start();
            this.l.post(this.A);
        } else {
            h.a("internal_push_open_Video", "resumePlay --> play");
            a();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        n.a().c(getApplicationContext(), this.f);
        super.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (R.id.btn_play == id) {
            this.e.start();
            a(this.v);
            this.o.setVisibility(8);
            this.s.setVisibility(8);
            return;
        }
        if (R.id.try_btn == id) {
            n.a().a(getApplicationContext(), this.f);
            finish();
        } else if (R.id.close_btn == id) {
            c();
        }
    }

    public void c() {
        n.a().d(getApplicationContext(), this.f);
        finish();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        h.a("internal_push_open_Video", "onDestroy");
        if (this.z != null) {
            this.z.b();
        }
        if (this.t != null) {
            this.t.recycle();
            this.t = null;
            System.gc();
        }
        if (this.e != null) {
            this.e.release();
            this.e = null;
        }
        if (this.g != null && !this.g.isRecycled()) {
            this.g.recycle();
            this.g = null;
            System.gc();
        }
        if (this.h != null && !this.h.isRecycled()) {
            this.h.recycle();
            this.h = null;
            System.gc();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 82) {
            b();
            return false;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    public void finish() {
        h.a("internal_push_open_Video", "finish");
        o.a().a(1, 10, this.f.e(), this.f.c(), "", n.a().b(), 0, this.f.l());
        super.finish();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        h.a("internal_push_open_Video", "on SurfaceTextureAvailable -- >");
        this.y = this.f4313c != surfaceTexture;
        this.f4313c = surfaceTexture;
        if (this.e == null || !this.x) {
            return;
        }
        h.a("internal_push_open_Video", "onSurfaceTextureAvailable --> play");
        a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        h.a("internal_push_open_Video", "on onSurfaceTextureDestroyed -- >");
        this.y = true;
        this.f4313c = null;
        return false;
    }

    protected void a(float f, boolean z) {
        this.w = f == 0.0f;
        this.f4314d.d(this.w);
        this.u = this.e.getCurrentPosition();
        float b2 = d.b(this);
        float f2 = b2 != 0.0f ? f / b2 : 0.0f;
        this.e.setVolume(f2, f2);
    }

    @Override // com.cmplay.internalpush.video.InnerPushReceiver.a
    public void a(Intent intent) {
        b();
    }

    @Override // com.cmplay.internalpush.video.InnerPushReceiver.a
    public void c(Intent intent) {
        float a2 = d.a(this);
        a(a2, !this.w && a2 == 0.0f);
    }

    private void e(Intent intent) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("info_for_show");
            h.a("internal_push_open_Video", "parseIntent   dataJson:" + stringExtra);
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
            this.f = new f(stringExtra);
        }
    }

    public void a(int i) {
        h.a("internal_push_open_Video", "startTimer");
        d();
        h();
        if (i < 0) {
            i = 0;
        }
        this.j.schedule(this.k, i + GamesStatusCodes.STATUS_ACHIEVEMENT_UNLOCK_FAILURE);
    }

    private void h() {
        if (this.j == null) {
            this.j = new Timer();
        }
        if (this.k == null) {
            this.k = new TimerTask() { // from class: com.cmplay.internalpush.ui.OpenScreenVideoActivity.5
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    h.a("internal_push_open_Video", "TimerTask    mIsCompletion:" + OpenScreenVideoActivity.this.i);
                    if (OpenScreenVideoActivity.this.i) {
                        return;
                    }
                    OpenScreenVideoActivity.this.i = true;
                    h.a("internal_push_open_Video", "TimerTask    finish()");
                }
            };
        }
    }

    public void d() {
        if (this.j != null) {
            this.j.cancel();
            this.j = null;
        }
        if (this.k != null) {
            this.k.cancel();
            this.k = null;
        }
    }
}
