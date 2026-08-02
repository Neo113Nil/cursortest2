package nl.dionsegijn.konfetti.modules;

import android.util.Log;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxg;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxk;
import com.squareup.cash.clientroutes.PatternRedaction;
import java.util.Random;

/* loaded from: classes4.dex */
public final class LocationModule {
    public Object maxX;
    public Object maxY;
    public float minX;
    public float minY;
    public final Object random;

    public LocationModule(zzxk zzxkVar, zzrc zzrcVar, float f, zzxg zzxgVar, float f2) {
        this.maxX = zzrcVar;
        this.minX = f;
        this.maxY = zzxgVar;
        this.minY = f2;
        this.random = zzxkVar;
    }

    public void zza(Throwable th) {
        PatternRedaction patternRedaction = zzxk.zzf;
        String str = "Unable to set zoom to " + this.minY;
        if (Log.isLoggable(patternRedaction.pattern, 5)) {
            Log.w("AutoZoom", patternRedaction.zza(str), th);
        }
        ((zzxk) this.random).zzg.set(false);
    }

    public LocationModule(Random random) {
        this.random = random;
    }
}
