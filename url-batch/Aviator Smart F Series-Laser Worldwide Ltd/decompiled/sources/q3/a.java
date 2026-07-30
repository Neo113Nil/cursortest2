package q3;

import android.content.Context;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.my.health.sleep.SleepViewHolder;
import com.crrepa.band.my.home.health.b;
import com.crrepa.band.my.home.health.viewholder.c;
import com.crrepa.band.my.home.health.viewholder.d;
import com.crrepa.band.my.home.health.viewholder.e;
import com.crrepa.band.my.home.health.viewholder.f;
import com.crrepa.band.my.home.health.viewholder.g;
import com.crrepa.band.my.home.health.viewholder.h;
import com.crrepa.band.my.home.health.viewholder.i;
import com.crrepa.band.my.home.health.viewholder.j;
import com.crrepa.band.my.home.health.viewholder.k;
import com.crrepa.band.my.home.health.viewholder.l;
import com.crrepa.band.my.home.health.viewholder.m;
import com.crrepa.band.my.home.health.viewholder.n;
import com.crrepa.band.my.home.health.viewholder.o;
import com.crrepa.band.my.home.health.viewholder.p;

/* loaded from: classes2.dex */
public class a {
    private a() {
    }

    public static b create(Context context, BaseViewHolder baseViewHolder, int i8) {
        if (i8 == 25) {
            return new j(context, baseViewHolder);
        }
        if (i8 == 49) {
            return new l(context, baseViewHolder);
        }
        switch (i8) {
            case 0:
                return new m(context, baseViewHolder);
            case 1:
                return new com.crrepa.band.my.home.health.viewholder.a(context, baseViewHolder);
            case 2:
                return new i(context, baseViewHolder);
            case 3:
                return new SleepViewHolder(context, baseViewHolder);
            case 4:
                return new com.crrepa.band.my.health.bloodpressure.b(context, baseViewHolder);
            case 5:
                return new c(context, baseViewHolder);
            case 6:
                return new d(context, baseViewHolder);
            default:
                switch (i8) {
                    case 16:
                        return new com.crrepa.band.my.health.heartrate.a(context, baseViewHolder);
                    case 17:
                    case 19:
                        return new com.crrepa.band.my.health.heartrate.b(context, baseViewHolder);
                    case 18:
                        return new f(context, baseViewHolder);
                    case 20:
                        return new k(context, baseViewHolder);
                    case 21:
                        return new g(context, baseViewHolder);
                    case 22:
                        return new com.crrepa.band.my.health.bloodoxygen.a(context, baseViewHolder);
                    case 23:
                        return new com.crrepa.band.my.health.hrv.b(context, baseViewHolder);
                    default:
                        switch (i8) {
                            case 34:
                                return new p(context, baseViewHolder);
                            case 35:
                                return new h(context, baseViewHolder);
                            case 36:
                                return new o(context, baseViewHolder);
                            case 37:
                                return new n(context, baseViewHolder);
                            case 38:
                                return new com.crrepa.band.my.training.gomoresport.exercisecapacity.a(context, baseViewHolder);
                            case 39:
                                return new com.crrepa.band.my.training.gomoresport.traininganalysis.a(context, baseViewHolder);
                            case 40:
                                return new com.crrepa.band.my.training.gomoresport.trainingrecovery.a(context, baseViewHolder);
                            default:
                                return new e(context, baseViewHolder, i8);
                        }
                }
        }
    }
}
