package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class vj2 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Context n;
    public final /* synthetic */ zn1 o;

    public /* synthetic */ vj2(Context context, zn1 zn1Var, int i) {
        this.m = i;
        this.n = context;
        this.o = zn1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        zn1 zn1Var = this.o;
        Context context = this.n;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                zn1Var.setValue(str);
                context.getClass();
                SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("settings", 0);
                sharedPreferences.getClass();
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString("theme", str);
                edit.apply();
                ak2.e(str);
                break;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                zn1Var.setValue(str2);
                context.getClass();
                SharedPreferences sharedPreferences2 = context.getApplicationContext().getSharedPreferences("settings", 0);
                sharedPreferences2.getClass();
                SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                edit2.putString("language", str2);
                edit2.apply();
                ak2.d(str2);
                break;
            case 2:
                String str3 = (String) obj;
                str3.getClass();
                zn1Var.setValue(str3);
                context.getClass();
                SharedPreferences sharedPreferences3 = context.getApplicationContext().getSharedPreferences("settings", 0);
                sharedPreferences3.getClass();
                SharedPreferences.Editor edit3 = sharedPreferences3.edit();
                edit3.putString("units", str3);
                edit3.apply();
                break;
            case 3:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                zn1Var.setValue(bool);
                context.getClass();
                SharedPreferences sharedPreferences4 = context.getApplicationContext().getSharedPreferences("settings", 0);
                sharedPreferences4.getClass();
                SharedPreferences.Editor edit4 = sharedPreferences4.edit();
                edit4.putBoolean("reminder_clean", booleanValue);
                edit4.apply();
                break;
            default:
                Boolean bool2 = (Boolean) obj;
                boolean booleanValue2 = bool2.booleanValue();
                zn1Var.setValue(bool2);
                context.getClass();
                SharedPreferences sharedPreferences5 = context.getApplicationContext().getSharedPreferences("settings", 0);
                sharedPreferences5.getClass();
                SharedPreferences.Editor edit5 = sharedPreferences5.edit();
                edit5.putBoolean("reminder_gem", booleanValue2);
                edit5.apply();
                break;
        }
        return Unit.a;
    }
}
