package com.cmplay.internalpush.video;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.cmplay.base.util.j;
import com.cmplay.base.util.x;
import com.cmplay.base.util.z;
import com.cmplay.internalpush.R;
import com.cmplay.internalpush.o;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.Random;

/* loaded from: classes.dex */
public class VideoAdDetailActivity extends Activity implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private static a f4346a;

    /* renamed from: b, reason: collision with root package name */
    private static b f4347b;

    /* renamed from: c, reason: collision with root package name */
    private static WeakReference<Bitmap> f4348c;

    /* renamed from: d, reason: collision with root package name */
    private static WeakReference<Bitmap> f4349d;
    private Bitmap e;
    private Button f;
    private ImageView g;
    private ImageView h;
    private TextView i;
    private ImageView j;
    private ImageView k;
    private ImageView l;
    private TextView m;

    public static boolean a(Context context, a aVar, b bVar, Bitmap bitmap, Bitmap bitmap2) {
        if (context == null || aVar == null || bVar == null) {
            return false;
        }
        f4346a = aVar;
        f4347b = bVar;
        if (bitmap != null) {
            f4348c = new WeakReference<>(bitmap);
        } else {
            f4348c = null;
        }
        if (bitmap2 != null) {
            f4349d = new WeakReference<>(bitmap2);
        } else {
            f4349d = null;
        }
        Intent intent = new Intent(context, (Class<?>) VideoAdDetailActivity.class);
        intent.setFlags(268435456);
        context.startActivity(intent);
        return true;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        int i = R.layout.cmplay_activity_video_detail;
        if (f4347b != null) {
            i = a(f4347b.h());
        }
        setContentView(i);
        if (f4346a == null || f4347b == null) {
            finish();
        } else {
            d();
            o.a().a(4, 1, f4347b.e(), f4347b.c(), "", 0, f4347b.x(), (int) f4347b.l());
        }
    }

    private int a(int i) {
        int i2;
        switch (i) {
            case 1:
                i2 = R.layout.cmplay_activity_video_detail;
                break;
            case 2:
                i2 = R.layout.cmplay_activity_video_detail_unityads_style;
                break;
            case 3:
                i2 = R.layout.cmplay_activity_video_detail_vungle_style;
                break;
            case 4:
                i2 = R.layout.cmplay_activity_video_detail_land;
                break;
            default:
                com.cmplay.base.util.h.a("internal_push", "getLayoutIdByDisplayType default");
                i2 = R.layout.cmplay_activity_video_detail;
                break;
        }
        com.cmplay.base.util.h.a("internal_push", "getLayoutIdByDisplayType displayType:" + i + "    layoutId:" + i2);
        return i2;
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        e();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c();
    }

    private void c() {
        if (f4347b != null) {
            setRequestedOrientation(4 == f4347b.h() ? 0 : 1);
        }
    }

    private void d() {
        this.g = (ImageView) findViewById(R.id.iv_replay);
        this.h = (ImageView) findViewById(R.id.iv_close);
        this.i = (TextView) findViewById(R.id.tv_title);
        this.j = (ImageView) findViewById(R.id.iv_icon);
        this.k = (ImageView) findViewById(R.id.iv_cover_image);
        this.l = (ImageView) findViewById(R.id.vast_pic_star);
        this.m = (TextView) findViewById(R.id.tv_download_num);
        this.f = (Button) findViewById(R.id.btn_calltoaction);
        this.g.setOnClickListener(this);
        this.h.setOnClickListener(this);
        this.f.setOnClickListener(this);
        this.k.setOnClickListener(this);
        this.j.setOnClickListener(this);
        c();
    }

    private void e() {
        String w;
        if (f4346a != null) {
            Bitmap bitmap = null;
            if (f4348c != null && f4348c.get() != null) {
                this.k.setImageBitmap(f4348c.get());
                bitmap = f4348c.get();
            } else {
                if (this.e == null) {
                    this.e = a();
                }
                if (this.e != null) {
                    this.k.setImageBitmap(this.e);
                    bitmap = this.e;
                }
            }
            this.i.setText(f4347b.o());
            if (f4349d != null && f4349d.get() != null) {
                this.j.setImageBitmap(f4349d.get());
            } else if (bitmap != null) {
                this.j.setImageBitmap(bitmap);
            }
        }
        if (f4347b.v() > 0) {
            com.cmplay.base.util.h.a("internal_push", "ivStarImage :" + this.l + "   tvDownLoadNum:" + this.m);
            if (this.l != null) {
                this.l.setVisibility(0);
            }
            if (TextUtils.isEmpty(f4347b.w())) {
                w = f4346a.c();
                if (TextUtils.isEmpty(w)) {
                    int nextInt = new Random().nextInt(9999999) + 1000000;
                    w = "(" + NumberFormat.getInstance().format(nextInt) + ")";
                    f4346a.a(w);
                }
            } else {
                w = f4347b.w();
            }
            this.m.setText(w);
            this.m.setVisibility(0);
        } else {
            if (this.l != null) {
                this.l.setVisibility(8);
            }
            this.m.setVisibility(8);
        }
        if (3 != f4347b.h()) {
            this.f.setText(f4347b.p());
        }
    }

    @TargetApi(10)
    public Bitmap a() {
        Bitmap bitmap;
        MediaMetadataRetriever mediaMetadataRetriever;
        try {
            mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(f4347b.r());
            bitmap = mediaMetadataRetriever.getFrameAtTime();
        } catch (IllegalArgumentException e) {
            e = e;
            bitmap = null;
        } catch (Exception e2) {
            e = e2;
            bitmap = null;
        }
        try {
            mediaMetadataRetriever.release();
        } catch (IllegalArgumentException e3) {
            e = e3;
            e.printStackTrace();
            com.cmplay.base.util.h.a("detail_page", "createVideoThumbnail  exception");
            return bitmap;
        } catch (Exception e4) {
            e = e4;
            e.printStackTrace();
            com.cmplay.base.util.h.a("detail_page", "createVideoThumbnail  exception");
            return bitmap;
        }
        return bitmap;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.iv_replay) {
            Boolean valueOf = Boolean.valueOf(f4346a.e());
            f4346a.a(true);
            f4346a.d(valueOf.booleanValue());
            IncentiveVideoPlayActivity.a(this, true, f4347b.n());
            finish();
            return;
        }
        if (id == R.id.iv_close) {
            o.a().a(4, 3, f4347b.e(), f4347b.c(), "", 0, f4347b.x(), (int) f4347b.l());
            finish();
            a(true);
        } else if (id == R.id.btn_calltoaction || id == R.id.iv_cover_image || id == R.id.iv_icon) {
            f();
            o.a().a(4, 2, f4347b.e(), f4347b.c(), "", 0, f4347b.x(), (int) f4347b.l());
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        o.a().a(4, 3, f4347b.e(), f4347b.c(), "", 0, f4347b.x(), (int) f4347b.l());
        a(true);
    }

    private void f() {
        f4346a.a(getApplication(), f4347b, new z() { // from class: com.cmplay.internalpush.video.VideoAdDetailActivity.1
            @Override // com.cmplay.base.util.z
            public void a(boolean z) {
                VideoAdDetailActivity.this.a(true);
                VideoAdDetailActivity.this.finish();
            }
        });
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        Intent intent = new Intent();
        intent.setAction("com.cmplay.libinnerpushvideo.video.Progress_notify");
        intent.putExtra("video_progress_status", 5);
        sendBroadcast(intent);
        if (this.e != null && !this.e.isRecycled()) {
            this.e.recycle();
            this.e = null;
            System.gc();
        }
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        com.cmplay.base.util.h.a("internal_push_VideoDetai", "VideoAdDetailActivity.sendBroadcast  onVideoComplete");
        Intent intent = new Intent();
        intent.setAction("com.cmplay.libinnerpushvideo.video.Progress_notify");
        intent.putExtra("video_progress_status", 2);
        intent.putExtra("is_complete_view", f4346a.d());
        sendBroadcast(intent);
        if (z) {
            b();
        }
    }

    public static void b() {
        if (x.c() && j.e()) {
            com.cmplay.base.util.e.a(new Runnable() { // from class: com.cmplay.internalpush.video.VideoAdDetailActivity.2
                @Override // java.lang.Runnable
                public void run() {
                    com.cmplay.base.util.h.a("internal_push_VideoDetai", "退出视频播放进程");
                    System.exit(0);
                }
            }, 2000L);
        }
    }
}
