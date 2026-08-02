package defpackage;

import android.content.Context;
import android.util.TypedValue;
import com.google.android.apps.authenticator2.R;
import java.util.LinkedHashMap;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ehi {
    public ehh a;
    private final Context b;
    private final Context c;
    private eff d;
    private fwm e;

    public ehi(Context context) {
        this.b = context;
        this.c = context.getApplicationContext();
    }

    public final int a(jhb jhbVar) {
        fwm fwmVar;
        jhbVar.getClass();
        if (this.a == null) {
            eff effVar = this.d;
            if (effVar != null && (fwmVar = this.e) != null) {
                fwmVar.C(efe.a, effVar, 1);
            }
            Context context = this.c;
            context.getClass();
            c(context, this.d, this.e);
        }
        ehh ehhVar = this.a;
        if (ehhVar == null) {
            throw new IllegalArgumentException("Color resolver not bound to Context.");
        }
        Object obj = ehhVar.b.get(jhbVar);
        if (obj != null) {
            return ((Number) obj).intValue();
        }
        throw new IllegalArgumentException("Failed to resolve " + jhbVar.name() + ".");
    }

    public final boolean b() {
        ehh ehhVar = this.a;
        if (ehhVar != null) {
            return ehhVar.a;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void c(Context context, eff effVar, fwm fwmVar) {
        Integer f;
        TypedValue typedValue = new TypedValue();
        boolean z = context.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true) && typedValue.data != 0;
        jhb[] values = jhb.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ksl.f(ixd.m(values.length), 16));
        for (jhb jhbVar : values) {
            switch (jhbVar.ordinal()) {
                case 0:
                    f = fhq.f(context, R.attr.colorSurface);
                    break;
                case 1:
                    f = fhq.f(context, R.attr.colorOnSurface);
                    break;
                case 2:
                    f = fhq.f(context, R.attr.colorOnSurfaceVariant);
                    break;
                case 3:
                    f = fhq.f(context, R.attr.colorOnPrimary);
                    break;
                case 4:
                    f = fhq.f(context, R.attr.colorPrimary);
                    break;
                case 5:
                    f = fhq.f(context, R.attr.colorError);
                    break;
                case 6:
                    f = fhq.f(context, R.attr.colorErrorContainer);
                    break;
                case 7:
                    f = fhq.f(context, R.attr.colorOnErrorContainer);
                    break;
                case 8:
                    f = fhq.f(context, R.attr.colorSurfaceContainerLowest);
                    break;
                case 9:
                    f = fhq.f(context, R.attr.colorSurfaceContainer);
                    break;
                case 10:
                    f = fhq.f(context, R.attr.colorOnError);
                    break;
                case 11:
                    f = fhq.f(context, R.attr.colorSurfaceVariant);
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    f = fhq.f(context, R.attr.colorPrimaryContainer);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    f = fhq.f(context, R.attr.colorPrimaryFixed);
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    f = fhq.f(context, R.attr.colorOnPrimaryFixed);
                    break;
                case 15:
                    f = Integer.valueOf(context.getColor(true != z ? R.color.gm3_ref_palette_yellow90 : R.color.gm3_ref_palette_yellow70));
                    break;
                case 16:
                    f = Integer.valueOf(context.getColor(true != z ? R.color.gm3_ref_palette_error20 : R.color.gm3_ref_palette_error80));
                    break;
                case 17:
                    f = Integer.valueOf(context.getColor(true != z ? R.color.gm3_sys_color_dark_tertiary : R.color.gm3_sys_color_light_tertiary));
                    break;
                case 18:
                    Integer f2 = fhq.f(context, R.attr.colorPrimary);
                    if (f2 == null) {
                        f = null;
                        break;
                    } else {
                        int intValue = f2.intValue();
                        if (Double.isNaN(20.400000000000002d)) {
                            throw new IllegalArgumentException("Cannot round NaN value.");
                        }
                        f = Integer.valueOf(va.c(intValue, (int) Math.round(20.400000000000002d)));
                        break;
                    }
                case 19:
                    f = fhq.f(context, R.attr.colorSecondaryContainer);
                    break;
                case 20:
                    f = fhq.f(context, R.attr.colorOnSecondaryContainer);
                    break;
                default:
                    throw new koj();
            }
            linkedHashMap.put(jhbVar, f);
        }
        this.a = new ehh(z, linkedHashMap);
        this.d = effVar;
        this.e = fwmVar;
    }
}
