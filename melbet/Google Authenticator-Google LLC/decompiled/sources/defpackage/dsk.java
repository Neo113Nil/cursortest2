package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.CrossProfileApps;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.UserHandle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.google.android.apps.authenticator2.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dsk {
    public static final String a = "dsk";

    private dsk() {
    }

    public static ebp a(final fwm fwmVar, final Context context, final gzp gzpVar) {
        List targetUserProfiles;
        Drawable profileSwitchingIconDrawable;
        CharSequence profileSwitchingLabel;
        String str;
        View.OnClickListener onClickListener;
        ebn ebnVar;
        final CrossProfileApps m = gd$$ExternalSyntheticApiModelOutline0.m(context.getSystemService(gd$$ExternalSyntheticApiModelOutline0.m68m()));
        if (m == null) {
            return null;
        }
        targetUserProfiles = m.getTargetUserProfiles();
        if (targetUserProfiles.isEmpty()) {
            return null;
        }
        final UserHandle userHandle = (UserHandle) targetUserProfiles.get(0);
        profileSwitchingIconDrawable = m.getProfileSwitchingIconDrawable(userHandle);
        profileSwitchingLabel = m.getProfileSwitchingLabel(userHandle);
        ebo eboVar = new ebo();
        eboVar.a(R.id.og_ai_custom_action);
        eboVar.j = (byte) (eboVar.j | 16);
        eboVar.b(90541);
        eboVar.c = -1;
        eboVar.j = (byte) (eboVar.j | 10);
        ebn ebnVar2 = ebn.b;
        if (ebnVar2 == null) {
            throw new NullPointerException("Null actionType");
        }
        eboVar.g = ebnVar2;
        eboVar.a(R.id.og_ai_switch_profile);
        eboVar.b = profileSwitchingIconDrawable;
        String charSequence = profileSwitchingLabel.toString();
        if (charSequence == null) {
            throw new NullPointerException("Null label");
        }
        eboVar.d = charSequence;
        eboVar.b(103027);
        eboVar.f = new View.OnClickListener() { // from class: dsj
            /* JADX WARN: Removed duplicated region for block: B:38:0x00dd  */
            /* JADX WARN: Removed duplicated region for block: B:40:? A[SYNTHETIC] */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onClick(View view) {
                List targetUserProfiles2;
                Intent intent;
                List targetUserProfiles3;
                List targetUserProfiles4;
                List targetUserProfiles5;
                String str2 = dsk.a;
                CrossProfileApps crossProfileApps = m;
                Context context2 = view.getContext();
                targetUserProfiles2 = crossProfileApps.getTargetUserProfiles();
                UserHandle userHandle2 = userHandle;
                boolean contains = targetUserProfiles2.contains(userHandle2);
                fwm fwmVar2 = fwmVar;
                gzp gzpVar2 = gzpVar;
                if (!contains) {
                    if (fwmVar2 != null) {
                        fwmVar2.B(new drn(fwmVar2, context2.getApplicationContext().getPackageName(), 11));
                    }
                    Log.e(dsk.a, "Trying to switch to a non-existing profile");
                    return;
                }
                Context context3 = context;
                PackageManager packageManager = context3.getPackageManager();
                String packageName = context3.getPackageName();
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                if (launchIntentForPackage == null) {
                    Log.e(dsk.a, "getLaunchIntentForPackage return null for package ".concat(String.valueOf(packageName)));
                    return;
                }
                ComponentName component = launchIntentForPackage.getComponent();
                if (component == null) {
                    Log.e(dsk.a, "Launch component was null for package ".concat(String.valueOf(packageName)));
                    return;
                }
                try {
                    crossProfileApps.startMainActivity(component, userHandle2);
                    if (fwmVar2 != null) {
                        boolean hasCategory = launchIntentForPackage.hasCategory("android.intent.category.LAUNCHER");
                        boolean hasCategory2 = launchIntentForPackage.hasCategory("android.intent.category.INFO");
                        targetUserProfiles5 = crossProfileApps.getTargetUserProfiles();
                        fwmVar2.y("OK", hasCategory, hasCategory2, targetUserProfiles5.contains(userHandle2), Build.VERSION.SDK_INT, context2.getApplicationContext().getPackageName());
                    }
                } catch (SecurityException e) {
                    intent = launchIntentForPackage;
                    try {
                        if (!gzpVar2.f()) {
                            throw e;
                        }
                        Toast.makeText(context2, context2.getString(((Integer) gzpVar2.b()).intValue()), 1).show();
                        if (fwmVar2 != null) {
                            boolean hasCategory3 = intent.hasCategory("android.intent.category.LAUNCHER");
                            boolean hasCategory4 = intent.hasCategory("android.intent.category.INFO");
                            targetUserProfiles4 = crossProfileApps.getTargetUserProfiles();
                            fwmVar2.y("SecurityException", hasCategory3, hasCategory4, targetUserProfiles4.contains(userHandle2), Build.VERSION.SDK_INT, context2.getApplicationContext().getPackageName());
                        }
                    } catch (Throwable th) {
                        th = th;
                        Throwable th2 = th;
                        if (fwmVar2 != null) {
                            throw th2;
                        }
                        boolean hasCategory5 = intent.hasCategory("android.intent.category.LAUNCHER");
                        boolean hasCategory6 = intent.hasCategory("android.intent.category.INFO");
                        targetUserProfiles3 = crossProfileApps.getTargetUserProfiles();
                        fwmVar2.y("OK", hasCategory5, hasCategory6, targetUserProfiles3.contains(userHandle2), Build.VERSION.SDK_INT, context2.getApplicationContext().getPackageName());
                        throw th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    intent = launchIntentForPackage;
                    Throwable th22 = th;
                    if (fwmVar2 != null) {
                    }
                }
            }
        };
        if (eboVar.j == 31 && (str = eboVar.d) != null && (onClickListener = eboVar.f) != null && (ebnVar = eboVar.g) != null) {
            ebp ebpVar = new ebp(eboVar.a, eboVar.b, eboVar.c, str, eboVar.e, onClickListener, ebnVar, eboVar.h, eboVar.i);
            int i = ebpVar.c;
            hoq.I((i != -1) ^ (ebpVar.b != null), "Either icon id or icon drawable must be specified");
            return ebpVar;
        }
        StringBuilder sb = new StringBuilder();
        if ((eboVar.j & 1) == 0) {
            sb.append(" id");
        }
        if ((eboVar.j & 2) == 0) {
            sb.append(" iconResId");
        }
        if (eboVar.d == null) {
            sb.append(" label");
        }
        if ((eboVar.j & 4) == 0) {
            sb.append(" veId");
        }
        if ((eboVar.j & 8) == 0) {
            sb.append(" newHighlight");
        }
        if (eboVar.f == null) {
            sb.append(" onClickListener");
        }
        if ((eboVar.j & 16) == 0) {
            sb.append(" visibleOnIncognito");
        }
        if (eboVar.g == null) {
            sb.append(" actionType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
