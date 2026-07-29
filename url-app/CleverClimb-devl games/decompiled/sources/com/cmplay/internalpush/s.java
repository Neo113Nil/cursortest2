package com.cmplay.internalpush;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.GradientDrawable;
import android.media.MediaPlayer;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.cmplay.internalpush.data.SmallVideoParseCloudData;
import com.cmplay.internalpush.data.SmallVideoSettingParseCloudData;
import com.cmplay.internalpush.video.InnerPushTextureView;
import com.google.android.gms.games.GamesStatusCodes;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: VideoPopManager.java */
/* loaded from: classes.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    private static s f4279a;
    private RelativeLayout k;
    private InnerPushTextureView l;
    private com.cmplay.internalpush.video.c m;
    private SurfaceTexture n;
    private LinearLayout o;
    private com.cmplay.internalpush.data.h p;
    private Timer v;
    private TimerTask w;

    /* renamed from: b, reason: collision with root package name */
    private Context f4280b = null;

    /* renamed from: c, reason: collision with root package name */
    private Activity f4281c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4282d = false;
    private int e = 0;
    private int f = 0;
    private int g = 0;
    private int h = 0;
    private int i = 0;
    private String j = null;
    private String q = null;
    private String r = null;
    private String s = null;
    private float t = -1.0f;
    private boolean u = false;

    private s() {
    }

    public static s a() {
        if (f4279a == null) {
            f4279a = new s();
        }
        return f4279a;
    }

    public boolean b() {
        return this.f4282d;
    }

    public void a(boolean z) {
        this.f4282d = z;
        com.cmplay.base.util.h.a("internal_push", "VideoPopManager.setHide    mHide:" + this.f4282d);
    }

    public void a(final Activity activity, final int i, final int i2, final int i3, final int i4, final String str, final int i5) {
        com.cmplay.base.util.h.a("VideoPopManager", "VideoPopManager.show    source:" + i5);
        this.f4281c = activity;
        this.f4280b = activity.getApplicationContext();
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = str;
        this.e = i5;
        a(false);
        activity.runOnUiThread(new Runnable() { // from class: com.cmplay.internalpush.s.1
            @Override // java.lang.Runnable
            public void run() {
                GradientDrawable gradientDrawable;
                s.this.p = new com.cmplay.internalpush.data.h(str);
                com.cmplay.base.util.h.a("VideoPopManager", "show");
                FrameLayout frameLayout = (FrameLayout) ((ViewGroup) activity.findViewById(android.R.id.content)).getChildAt(0);
                if (s.this.o == null) {
                    s.this.o = (LinearLayout) activity.getLayoutInflater().inflate(R.layout.cmplay_video_pop, (ViewGroup) null);
                    frameLayout.addView(s.this.o);
                    s.this.o.setOnClickListener(new View.OnClickListener() { // from class: com.cmplay.internalpush.s.1.1
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            int p;
                            int i6;
                            com.cmplay.internalpush.a.b.a(activity, s.this.p, null);
                            switch (i5) {
                                case 8:
                                    p = SmallVideoParseCloudData.a(activity).p();
                                    i6 = p;
                                    break;
                                case 9:
                                    p = SmallVideoSettingParseCloudData.a(activity).p();
                                    i6 = p;
                                    break;
                                default:
                                    i6 = 0;
                                    break;
                            }
                            o.a().a(i5, 2, s.this.p.e(), s.this.p.c(), "", 0, i6, s.this.p.l());
                        }
                    });
                    s.this.m = new com.cmplay.internalpush.video.c();
                    s.this.m.setAudioStreamType(3);
                    s.this.k = (RelativeLayout) s.this.o.findViewById(R.id.video_layout);
                    s.this.l = (InnerPushTextureView) s.this.o.findViewById(R.id.video_screen);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) s.this.k.getLayoutParams();
                    layoutParams.width = layoutParams.height;
                    s.this.k.setLayoutParams(layoutParams);
                    s.this.l.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: com.cmplay.internalpush.s.1.2
                        @Override // android.view.TextureView.SurfaceTextureListener
                        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                        }

                        @Override // android.view.TextureView.SurfaceTextureListener
                        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i6, int i7) {
                            com.cmplay.base.util.h.a("VideoPopManager", "onSurfaceTextureAvailable ");
                            s.this.n = surfaceTexture;
                            if (s.this.m != null) {
                                s.this.c(activity);
                            }
                        }

                        @Override // android.view.TextureView.SurfaceTextureListener
                        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i6, int i7) {
                            com.cmplay.base.util.h.a("VideoPopManager", "onSurfaceTextureSizeChanged ");
                        }

                        @Override // android.view.TextureView.SurfaceTextureListener
                        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                            com.cmplay.base.util.h.a("VideoPopManager", "onSurfaceTextureDestroyed ");
                            s.this.e();
                            s.this.n = null;
                            return false;
                        }
                    });
                    if (TextUtils.isEmpty(s.this.s) && TextUtils.isEmpty(s.this.r)) {
                        gradientDrawable = null;
                    } else {
                        int parseColor = Color.parseColor(s.this.s);
                        int parseColor2 = Color.parseColor(s.this.r);
                        gradientDrawable = new GradientDrawable();
                        gradientDrawable.setColor(parseColor2);
                        gradientDrawable.setCornerRadius(0);
                        gradientDrawable.setStroke(com.cmplay.base.util.m.a(activity, 2), parseColor);
                        s.this.o.setBackgroundDrawable(gradientDrawable);
                    }
                    int i6 = i3;
                    int i7 = i4;
                    TextView textView = (TextView) s.this.o.findViewById(R.id.video_title);
                    if (!TextUtils.isEmpty(s.this.p.o())) {
                        textView.setText(s.this.p.o());
                        if (!TextUtils.isEmpty(s.this.q)) {
                            textView.setTextColor(Color.parseColor(s.this.q));
                        }
                        if (gradientDrawable != null) {
                            textView.setBackgroundDrawable(gradientDrawable);
                        }
                        if (-1.0f != s.this.t) {
                            textView.setTextSize(s.this.t);
                        }
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                        textView.setBackgroundDrawable(null);
                        i7 = i3;
                    }
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) s.this.o.getLayoutParams();
                    layoutParams2.leftMargin = i;
                    layoutParams2.topMargin = (s.d(activity) - i2) - i4;
                    layoutParams2.width = i6;
                    layoutParams2.height = i7;
                    s.this.o.setLayoutParams(layoutParams2);
                }
                switch (s.this.e) {
                    case 8:
                        com.cmplay.base.util.h.a("internal_push", "SmallVideoResultParseCloudData  VideoPopManager  通知下载下一个");
                        Intent intent = new Intent();
                        intent.setAction("com.cmplay.small_video.Progress_notify");
                        intent.putExtra("video_progress_status", 1);
                        activity.sendBroadcast(intent);
                        break;
                    case 9:
                        com.cmplay.base.util.h.a("internal_push", "SmallVideoSettingParseCloudData  VideoPopManager  通知下载下一个");
                        Intent intent2 = new Intent();
                        intent2.setAction("com.cmplay.small_setting_video.Progress_notify");
                        intent2.putExtra("video_progress_status", 1);
                        activity.sendBroadcast(intent2);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void c(final Activity activity) {
        FileInputStream fileInputStream;
        if (this.n == null) {
            return;
        }
        FileInputStream fileInputStream2 = null;
        fileInputStream2 = null;
        try {
            try {
                try {
                    this.m.reset();
                    this.m.a(this.n);
                    fileInputStream = new FileInputStream(this.p.p());
                } catch (IOException unused) {
                    return;
                }
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
            fileInputStream = fileInputStream2;
        }
        try {
            com.cmplay.base.util.h.a("VideoPopManager", "play " + this.p.p());
            this.m.setDataSource(fileInputStream.getFD());
            this.m.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.cmplay.internalpush.s.2
                @Override // android.media.MediaPlayer.OnErrorListener
                public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                    com.cmplay.base.util.h.a("VideoPopManager", "setOnErrorListener   onError" + s.this.p.p());
                    s.this.a(activity);
                    return false;
                }
            });
            this.m.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.cmplay.internalpush.s.3
                @Override // android.media.MediaPlayer.OnCompletionListener
                public void onCompletion(MediaPlayer mediaPlayer) {
                    com.cmplay.base.util.h.a("VideoPopManager", "onCompletion " + s.this.p.p());
                    s.this.u = true;
                    s.this.c();
                }
            });
            com.cmplay.internalpush.video.c cVar = this.m;
            MediaPlayer.OnPreparedListener onPreparedListener = new MediaPlayer.OnPreparedListener() { // from class: com.cmplay.internalpush.s.4
                @Override // android.media.MediaPlayer.OnPreparedListener
                public void onPrepared(MediaPlayer mediaPlayer) {
                    com.cmplay.base.util.h.a("VideoPopManager", "onPrepared " + s.this.p.p());
                    s.this.m.start();
                    s.this.a(s.this.m.getDuration());
                }
            };
            cVar.setOnPreparedListener(onPreparedListener);
            this.m.prepare();
            fileInputStream.close();
            fileInputStream2 = onPreparedListener;
        } catch (Exception e2) {
            e = e2;
            fileInputStream2 = fileInputStream;
            e.printStackTrace();
            if (fileInputStream2 != null) {
                fileInputStream2.close();
                fileInputStream2 = fileInputStream2;
            }
        } catch (Throwable th2) {
            th = th2;
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.m != null) {
            this.m.pause();
        }
    }

    public void a(final Activity activity) {
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.cmplay.internalpush.s.5
                @Override // java.lang.Runnable
                public void run() {
                    if (s.this.o != null) {
                        ((FrameLayout) ((ViewGroup) activity.findViewById(android.R.id.content)).getChildAt(0)).removeView(s.this.o);
                        s.this.o = null;
                    }
                    if (s.this.m != null) {
                        s.this.m.release();
                        s.this.m = null;
                    }
                    com.cmplay.base.util.h.a("VideoPopManager", "hide   mPlayer.release()");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(Activity activity) {
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
            return displayMetrics.heightPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return displayMetrics.heightPixels;
        }
    }

    public void c() {
        switch (this.e) {
            case 8:
                com.cmplay.base.util.h.a("internal_push", "SmallVideoParseCloudData  VideoPopManager  通知播放下一个");
                Intent intent = new Intent();
                intent.setAction("com.cmplay.small_video.Progress_notify");
                intent.putExtra("video_progress_status", 2);
                intent.putExtra("is_complete_view", true);
                this.f4280b.sendBroadcast(intent);
                break;
            case 9:
                com.cmplay.base.util.h.a("internal_push", "SmallVideoSettingParseCloudData  VideoPopManager  通知播放下一个");
                Intent intent2 = new Intent();
                intent2.setAction("com.cmplay.small_setting_video.Progress_notify");
                intent2.putExtra("video_progress_status", 2);
                intent2.putExtra("is_complete_view", true);
                this.f4280b.sendBroadcast(intent2);
                break;
        }
    }

    public void a(int i) {
        com.cmplay.base.util.h.a("VideoPopManager", "startTimer");
        d();
        f();
        if (i < 0) {
            i = 0;
        }
        this.v.schedule(this.w, i + GamesStatusCodes.STATUS_ACHIEVEMENT_UNLOCK_FAILURE);
    }

    private void f() {
        if (this.v == null) {
            this.v = new Timer();
        }
        if (this.w == null) {
            this.w = new TimerTask() { // from class: com.cmplay.internalpush.s.6
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    com.cmplay.base.util.h.a("VideoPopManager", "TimerTask    mIsCompletion:" + s.this.u);
                    if (s.this.u) {
                        return;
                    }
                    s.this.u = true;
                    if (s.this.m != null) {
                        s.this.m.release();
                        s.this.m = null;
                    }
                    s.this.c();
                    com.cmplay.base.util.h.a("VideoPopManager", "TimerTask    playNext()");
                }
            };
        }
    }

    public void d() {
        com.cmplay.base.util.h.a("VideoPopManager", "resetTimer()");
        if (this.v != null) {
            this.v.cancel();
            this.v = null;
        }
        if (this.w != null) {
            this.w.cancel();
            this.w = null;
        }
    }
}
