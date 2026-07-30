package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class x40 {
    public static volatile x40 dgRBjINgWbAK;
    public static final Object wdg6QnbFHrFF = new Object();
    public final nw OPXfSBeufaJ8;
    public final ReentrantReadWriteLock PxuCJdSBwIXG;
    public final jx1 RAsUl2FVSrh6;
    public volatile int TSizfFm2Yiuu;
    public final Handler Y1f8riQaR6yg;
    public final w40 a92UlCVFR9N8;
    public final u40 e9gEMXR7LXtO;
    public final ma lS5Rgt96tfkO;
    public final int rtx2ld2ELZv4;

    public x40(dc0 dc0Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.PxuCJdSBwIXG = reentrantReadWriteLock;
        this.TSizfFm2Yiuu = 3;
        w40 w40Var = (w40) dc0Var.lS5Rgt96tfkO;
        this.a92UlCVFR9N8 = w40Var;
        int i = dc0Var.PxuCJdSBwIXG;
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = (nw) dc0Var.TSizfFm2Yiuu;
        this.Y1f8riQaR6yg = new Handler(Looper.getMainLooper());
        this.lS5Rgt96tfkO = new ma(0);
        this.RAsUl2FVSrh6 = new jx1(29);
        u40 u40Var = new u40(this);
        this.e9gEMXR7LXtO = u40Var;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.TSizfFm2Yiuu = 0;
            } catch (Throwable th) {
                this.PxuCJdSBwIXG.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (TSizfFm2Yiuu() == 0) {
            try {
                w40Var.PxuCJdSBwIXG(new t40(u40Var));
            } catch (Throwable th2) {
                a92UlCVFR9N8(th2);
            }
        }
    }

    public static x40 PxuCJdSBwIXG() {
        x40 x40Var;
        synchronized (wdg6QnbFHrFF) {
            try {
                x40Var = dgRBjINgWbAK;
                if (!(x40Var != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return x40Var;
    }

    public static boolean Y1f8riQaR6yg() {
        return dgRBjINgWbAK != null;
    }

    public final void RAsUl2FVSrh6(EditorInfo editorInfo) {
        if (TSizfFm2Yiuu() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        u40 u40Var = this.e9gEMXR7LXtO;
        u40Var.getClass();
        Bundle bundle = editorInfo.extras;
        a61 a61Var = (a61) u40Var.TSizfFm2Yiuu.OPXfSBeufaJ8;
        int PxuCJdSBwIXG = a61Var.PxuCJdSBwIXG(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", PxuCJdSBwIXG != 0 ? ((ByteBuffer) a61Var.dgRBjINgWbAK).getInt(PxuCJdSBwIXG + a61Var.rtx2ld2ELZv4) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }

    public final int TSizfFm2Yiuu() {
        this.PxuCJdSBwIXG.readLock().lock();
        try {
            return this.TSizfFm2Yiuu;
        } finally {
            this.PxuCJdSBwIXG.readLock().unlock();
        }
    }

    public final void a92UlCVFR9N8(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.PxuCJdSBwIXG.writeLock().lock();
        try {
            this.TSizfFm2Yiuu = 2;
            arrayList.addAll(this.lS5Rgt96tfkO);
            this.lS5Rgt96tfkO.clear();
            this.PxuCJdSBwIXG.writeLock().unlock();
            this.Y1f8riQaR6yg.post(new th(arrayList, this.TSizfFm2Yiuu, th));
        } catch (Throwable th2) {
            this.PxuCJdSBwIXG.writeLock().unlock();
            throw th2;
        }
    }

    public final void e9gEMXR7LXtO() {
        if (!(this.rtx2ld2ELZv4 == 1)) {
            u9.rtx2ld2ELZv4("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (TSizfFm2Yiuu() == 1) {
            return;
        }
        this.PxuCJdSBwIXG.writeLock().lock();
        try {
            if (this.TSizfFm2Yiuu == 0) {
                return;
            }
            this.TSizfFm2Yiuu = 0;
            this.PxuCJdSBwIXG.writeLock().unlock();
            u40 u40Var = this.e9gEMXR7LXtO;
            x40 x40Var = u40Var.PxuCJdSBwIXG;
            try {
                x40Var.a92UlCVFR9N8.PxuCJdSBwIXG(new t40(u40Var));
            } catch (Throwable th) {
                x40Var.a92UlCVFR9N8(th);
            }
        } finally {
            this.PxuCJdSBwIXG.writeLock().unlock();
        }
    }

    public final int lS5Rgt96tfkO(CharSequence charSequence, int i) {
        if (!(TSizfFm2Yiuu() == 1)) {
            u9.rtx2ld2ELZv4("Not initialized yet");
            return 0;
        }
        ki0.RfyTYNmI9Srp(charSequence, "charSequence cannot be null");
        m9 m9Var = this.e9gEMXR7LXtO.lS5Rgt96tfkO;
        m9Var.getClass();
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            ym2[] ym2VarArr = (ym2[]) spanned.getSpans(i, i + 1, ym2.class);
            if (ym2VarArr.length > 0) {
                return spanned.getSpanStart(ym2VarArr[0]);
            }
        }
        return ((e50) m9Var.e6tOsSdd2EFb(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new e50(i))).OPXfSBeufaJ8;
    }
}
