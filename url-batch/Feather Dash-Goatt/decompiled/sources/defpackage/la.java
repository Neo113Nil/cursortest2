package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.util.Log;
import com.appsflyer.internal.l;
import com.feathherdashh.dashgame.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class la {
    public final Context a;
    public final SoundPool b;
    public final Map c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public an0 h;
    public MediaPlayer i;
    public Integer j;

    public la(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        SoundPool build = new SoundPool.Builder().setMaxStreams(4).setAudioAttributes(new AudioAttributes.Builder().setUsage(14).setContentType(4).build()).build();
        this.b = build;
        this.c = ik0.c(new Pair(gc1.d, Integer.valueOf(build.load(applicationContext, R.raw.sfx_jump, 1))), new Pair(gc1.e, Integer.valueOf(build.load(applicationContext, R.raw.sfx_victory, 1))), new Pair(gc1.g, Integer.valueOf(build.load(applicationContext, R.raw.sfx_fail, 1))), new Pair(gc1.h, Integer.valueOf(build.load(applicationContext, R.raw.sfx_victory, 1))), new Pair(gc1.i, Integer.valueOf(build.load(applicationContext, R.raw.sfx_victory, 1))), new Pair(gc1.j, Integer.valueOf(build.load(applicationContext, R.raw.sfx_victory, 1))), new Pair(gc1.k, Integer.valueOf(build.load(applicationContext, R.raw.sfx_victory, 1))));
        this.e = true;
        this.f = true;
        this.g = true;
        this.h = an0.d;
    }

    public final void a(an0 an0Var) {
        Integer num;
        this.h = an0Var;
        if (!this.d || !this.e || !this.f) {
            an0 an0Var2 = an0.d;
            if (an0Var == an0Var2) {
                this.h = an0Var2;
                b();
                return;
            }
            return;
        }
        int ordinal = an0Var.ordinal();
        MediaPlayer mediaPlayer = null;
        if (ordinal == 0) {
            num = null;
        } else {
            if (ordinal != 1 && ordinal != 2) {
                l.a();
                return;
            }
            num = Integer.valueOf(R.raw.bg_music);
        }
        if (num == null) {
            this.h = an0.d;
            b();
            return;
        }
        MediaPlayer mediaPlayer2 = this.i;
        if (mediaPlayer2 != null && mediaPlayer2.isPlaying() && Intrinsics.a(this.j, num)) {
            return;
        }
        b();
        MediaPlayer create = MediaPlayer.create(this.a, num.intValue());
        if (create != null) {
            create.setLooping(true);
            create.setVolume(0.42f, 0.42f);
            create.start();
            mediaPlayer = create;
        }
        this.i = mediaPlayer;
        this.j = num;
    }

    public final void b() {
        Object j31Var;
        try {
            i31 i31Var = k31.d;
            MediaPlayer mediaPlayer = this.i;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
            }
            MediaPlayer mediaPlayer2 = this.i;
            if (mediaPlayer2 != null) {
                mediaPlayer2.release();
                j31Var = Unit.a;
            } else {
                j31Var = null;
            }
        } catch (Throwable th) {
            i31 i31Var2 = k31.d;
            j31Var = new j31(th);
        }
        Throwable a = k31.a(j31Var);
        if (a != null) {
            Log.w("AudioController", "Music stop ignored", a);
        }
        this.i = null;
        this.j = null;
    }
}
