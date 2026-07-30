package com.artillery.ctc;

import android.media.AudioAttributes;
import android.media.MediaPlayer;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final a f684c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public MediaPlayer f685a;

    /* renamed from: b, reason: collision with root package name */
    public String f686b;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final b a() {
            return C0014b.f687a.a();
        }
    }

    /* renamed from: com.artillery.ctc.b$b, reason: collision with other inner class name */
    public static final class C0014b {

        /* renamed from: a, reason: collision with root package name */
        public static final C0014b f687a = new C0014b();

        /* renamed from: b, reason: collision with root package name */
        public static final b f688b = new b(null);

        public final b a() {
            return f688b;
        }
    }

    public /* synthetic */ b(o oVar) {
        this();
    }

    public final void a(String path) {
        kotlin.jvm.internal.s.checkNotNullParameter(path, "path");
        MediaPlayer mediaPlayer = this.f685a;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            mediaPlayer.setDataSource(path);
            mediaPlayer.prepare();
            mediaPlayer.start();
            this.f686b = path;
        }
    }

    public b() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f685a = mediaPlayer;
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).setUsage(1).build());
        this.f686b = String.valueOf(System.currentTimeMillis());
    }
}
