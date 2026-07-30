package defpackage;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.widget.DatePicker;
import com.google.firebase.encoders.json.BuildConfig;
import j$.time.LocalDate;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class v4 implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Context n;
    public final /* synthetic */ zn1 o;

    public /* synthetic */ v4(Context context, zn1 zn1Var, int i) {
        this.m = i;
        this.n = context;
        this.o = zn1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        LocalDate now;
        int i = this.m;
        final zn1 zn1Var = this.o;
        switch (i) {
            case 0:
                Long l = (Long) zn1Var.getValue();
                if (l == null || (now = LocalDate.ofEpochDay(l.longValue())) == null) {
                    now = LocalDate.now();
                }
                new DatePickerDialog(this.n, new DatePickerDialog.OnDateSetListener() { // from class: z4
                    @Override // android.app.DatePickerDialog.OnDateSetListener
                    public final void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
                        zn1.this.setValue(Long.valueOf(LocalDate.of(i2, i3 + 1, i4).toEpochDay()));
                    }
                }, now.getYear(), now.getMonthValue() - 1, now.getDayOfMonth()).show();
                break;
            default:
                List<a61> list = (List) zn1Var.getValue();
                StringBuilder sb = new StringBuilder("name,type,metal,fineness,weight_g,value,purchase_date_epochday,place\n");
                for (a61 a61Var : list) {
                    sb.append(yh2.i(a61Var.b));
                    sb.append(',');
                    sb.append(yh2.i(a61Var.c));
                    sb.append(',');
                    sb.append(yh2.i(a61Var.d));
                    sb.append(',');
                    sb.append(yh2.i(a61Var.e));
                    sb.append(',');
                    Object obj = a61Var.f;
                    Object obj2 = BuildConfig.FLAVOR;
                    if (obj == null) {
                        obj = BuildConfig.FLAVOR;
                    }
                    sb.append(obj);
                    sb.append(',');
                    Object obj3 = a61Var.i;
                    if (obj3 == null) {
                        obj3 = BuildConfig.FLAVOR;
                    }
                    sb.append(obj3);
                    sb.append(',');
                    Long l2 = a61Var.g;
                    if (l2 != null) {
                        obj2 = l2;
                    }
                    sb.append(obj2);
                    sb.append(',');
                    sb.append(yh2.i(a61Var.h));
                    sb.append('\n');
                }
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/csv");
                intent.putExtra("android.intent.extra.SUBJECT", "MaxLine BY — jewelry list");
                intent.putExtra("android.intent.extra.TEXT", sb.toString());
                this.n.startActivity(Intent.createChooser(intent, null));
                break;
        }
        return Unit.a;
    }
}
