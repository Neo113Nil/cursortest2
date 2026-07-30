package p000createpolar;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import java.util.Objects;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageRippleDrawablePhantomOlympianStrike1652 extends PolarVoyageLayoutTitaniumOlympian9962 {
    public final /* synthetic */ PolarVoyageMotionLayoutHeroSpeed4592 PolarVoyageZipVortexCelestial6185;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolarVoyageRippleDrawablePhantomOlympianStrike1652(PolarVoyageMotionLayoutHeroSpeed4592 polarVoyageMotionLayoutHeroSpeed4592, Looper looper) {
        super(looper);
        this.PolarVoyageZipVortexCelestial6185 = polarVoyageMotionLayoutHeroSpeed4592;
        Looper.getMainLooper();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        PolarVoyageMotionLayoutHeroSpeed4592 polarVoyageMotionLayoutHeroSpeed4592 = this.PolarVoyageZipVortexCelestial6185;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new PolarVoyageMeteringPointUltraHeroSpeed6311());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof PolarVoyageLevelListDrawableRogueEclipse2191) {
                        polarVoyageMotionLayoutHeroSpeed4592.PolarVoyageTextInputEditTextNebulaHero6651 = (PolarVoyageLevelListDrawableRogueEclipse2191) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        polarVoyageMotionLayoutHeroSpeed4592.PolarVoyageDiffUtilTurboStrike5735 = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = PolarVoyageMotionLayoutHeroSpeed4592.PolarVoyageRotateAnimationCyberCelestialDelta4768.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                            return;
                        }
                        return;
                    }
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    if (group != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", group2);
                        polarVoyageMotionLayoutHeroSpeed4592.PolarVoyageMotionLayoutTransitionHeroVision4068(extras, group);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
                }
                if (stringExtra2.startsWith("|")) {
                    String[] split = stringExtra2.split("\\|");
                    if (split.length <= 2 || !Objects.equals(split[1], "ID")) {
                        Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                        return;
                    }
                    String str = split[2];
                    String str2 = split[3];
                    if (str2.startsWith(":")) {
                        str2 = str2.substring(1);
                    }
                    polarVoyageMotionLayoutHeroSpeed4592.PolarVoyageMotionLayoutTransitionHeroVision4068(intent2.putExtra("error", str2).getExtras(), str);
                    return;
                }
                synchronized (polarVoyageMotionLayoutHeroSpeed4592.PolarVoyageZipVortexCelestial6185) {
                    int i = 0;
                    while (true) {
                        try {
                            PolarVoyageLevelListDrawablePhoenixMegaNebula9939 polarVoyageLevelListDrawablePhoenixMegaNebula9939 = polarVoyageMotionLayoutHeroSpeed4592.PolarVoyageZipVortexCelestial6185;
                            if (i < polarVoyageLevelListDrawablePhoenixMegaNebula9939.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
                                polarVoyageMotionLayoutHeroSpeed4592.PolarVoyageMotionLayoutTransitionHeroVision4068(intent2.getExtras(), (String) polarVoyageLevelListDrawablePhoenixMegaNebula9939.PolarVoyageBitmapVisionAuroraPixel4705(i));
                                i++;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }
}
