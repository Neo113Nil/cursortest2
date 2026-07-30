package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Trace;
import p000createpolar.PolarVoyageAlarmManagerAlphaInferno3493;
import p000createpolar.PolarVoyageStateListAnimatorNovaXUltraQuantum4812;
import p000createpolar.PolarVoyageToolbarNovaTitanSpeed3010;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            throw new PolarVoyageToolbarNovaTitanSpeed3010("Context cannot be null");
        }
        if (context.getApplicationContext() == null) {
            return true;
        }
        PolarVoyageAlarmManagerAlphaInferno3493 PolarVoyageCameraPixelBlaze2629 = PolarVoyageAlarmManagerAlphaInferno3493.PolarVoyageCameraPixelBlaze2629(context);
        Class<?> cls = getClass();
        Context context2 = (Context) PolarVoyageCameraPixelBlaze2629.PolarVoyageBottomSheetOmegaNeo1907;
        try {
            try {
                PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageMotionLayoutTransitionHeroVision4068("Startup");
                PolarVoyageCameraPixelBlaze2629.PolarVoyageItemDecorationUltraDeltaEpic7485(context2.getPackageManager().getProviderInfo(new ComponentName(context2, cls), 128).metaData);
                return true;
            } catch (PackageManager.NameNotFoundException e) {
                throw new PolarVoyageToolbarNovaTitanSpeed3010(e);
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
