package ru.rustore.sdk.pay.internal;

import android.content.res.Resources;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.rustore.sdk.pay.R;
import ru.rustore.sdk.pay.internal.kd;
import ru.rustore.sdk.pay.internal.ml;
import ru.rustore.sdk.pay.internal.s9;

/* loaded from: classes3.dex */
public final class gd extends kotlin.jvm.internal.s implements Function1<kd, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fd f44171a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd(fd fdVar) {
        super(1);
        this.f44171a = fdVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        int i4;
        String string;
        String str;
        Object obj3;
        Object obj4;
        kd state = (kd) obj;
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof kd.a) {
            fd fdVar = this.f44171a;
            kd.a aVar = (kd.a) state;
            LinearLayout linearLayout = fdVar.f44099f;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            LinearLayout linearLayout2 = fdVar.f44101g;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            TextView textView = fdVar.f44095d;
            if (textView != null) {
                textView.setVisibility(aVar.f44452g ? 0 : 8);
            }
            TextView textView2 = fdVar.f44074L;
            if (textView2 != null) {
                textView2.setVisibility(aVar.f44453h ? 0 : 8);
            }
            fdVar.a(aVar.f44448c);
            fdVar.a(aVar.f44449d, aVar.f44447b);
            fdVar.a(aVar.f44446a, aVar.f44451f);
            fdVar.a(aVar.f44448c.f43909c, aVar.f44449d, aVar.f44451f);
            e0 e0Var = aVar.f44450e.f44051e;
            ImageView imageView = fdVar.f44102h;
            if (imageView != null) {
                q6.a(imageView, e0Var.f43982a.getValue(), Integer.valueOf(R.drawable.sdk_pay_ic_product_image_placeholder), fdVar.getResources().getDimension(R.dimen.sdk_pay_bottom_sheet_image_product_radius));
            }
            TextView textView3 = fdVar.f44103i;
            if (textView3 != null) {
                textView3.setText(e0Var.f43983b.getValue());
            }
            TextView textView4 = fdVar.f44104j;
            if (textView4 != null) {
                textView4.setText(fdVar.getString(R.string.sdk_pay_application_purchase_subtitle));
            }
        } else if (state instanceof kd.b) {
            fd fdVar2 = this.f44171a;
            kd.b bVar = (kd.b) state;
            LinearLayout linearLayout3 = fdVar2.f44099f;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(8);
            }
            LinearLayout linearLayout4 = fdVar2.f44101g;
            if (linearLayout4 != null) {
                linearLayout4.setVisibility(0);
            }
            TextView textView5 = fdVar2.f44095d;
            if (textView5 != null) {
                textView5.setVisibility(bVar.f44460g ? 0 : 8);
            }
            TextView textView6 = fdVar2.f44074L;
            if (textView6 != null) {
                textView6.setVisibility(bVar.f44461h ? 0 : 8);
            }
            TextView textView7 = fdVar2.f44075M;
            if (textView7 != null) {
                textView7.setVisibility((!bVar.f44462i || Intrinsics.areEqual(bVar.f44459f, s9.a.f44973a)) ? 8 : 0);
            }
            TextView textView8 = fdVar2.f44076N;
            if (textView8 != null) {
                textView8.setVisibility(bVar.f44463j ? 0 : 8);
            }
            fdVar2.a(bVar.f44456c);
            fdVar2.a(bVar.f44457d, bVar.f44455b);
            fdVar2.a(bVar.f44454a, bVar.f44459f);
            fdVar2.a(bVar.f44456c.f43909c, bVar.f44457d, bVar.f44459f);
            ze zeVar = bVar.f44458e.f44822g;
            ImageView imageView2 = fdVar2.f44102h;
            if (imageView2 != null) {
                q6.a(imageView2, zeVar.getIcon().getValue(), Integer.valueOf(R.drawable.sdk_pay_ic_product_image_placeholder), fdVar2.getResources().getDimension(R.dimen.sdk_pay_bottom_sheet_image_product_radius));
            }
            TextView textView9 = fdVar2.f44103i;
            if (textView9 != null) {
                textView9.setText(zeVar.getTitle().getValue());
            }
            TextView textView10 = fdVar2.f44104j;
            if (textView10 != null) {
                textView10.setText(fdVar2.getString(R.string.sdk_pay_product_purchase_subtitle));
            }
            fdVar2.a(bVar.f44464k);
        } else if (state instanceof kd.d) {
            fd fdVar3 = this.f44171a;
            kd.d dVar = (kd.d) state;
            int i5 = fd.f44062g0;
            ml mlVar = (ml) CollectionsKt.first((List) dVar.f44473h);
            boolean z4 = mlVar instanceof ml.a;
            LinearLayout linearLayout5 = fdVar3.f44099f;
            if (linearLayout5 != null) {
                linearLayout5.setVisibility(8);
            }
            LinearLayout linearLayout6 = fdVar3.f44101g;
            if (linearLayout6 != null) {
                linearLayout6.setVisibility(0);
            }
            TextView textView11 = fdVar3.f44095d;
            if (textView11 != null) {
                textView11.setVisibility(dVar.f44469d ? 0 : 8);
            }
            View view = fdVar3.f44097e;
            if (view != null) {
                view.setVisibility((dVar.f44475j == null || !dVar.f44469d) ? 8 : 0);
            }
            TextView textView12 = fdVar3.f44074L;
            if (textView12 != null) {
                textView12.setVisibility((!dVar.f44470e || z4) ? 8 : 0);
            }
            TextView textView13 = fdVar3.f44075M;
            if (textView13 != null) {
                textView13.setVisibility((!dVar.f44471f || Intrinsics.areEqual(dVar.f44468c, s9.a.f44973a)) ? 8 : 0);
            }
            TextView textView14 = fdVar3.f44076N;
            if (textView14 != null) {
                textView14.setVisibility(dVar.f44472g ? 0 : 8);
            }
            View view2 = fdVar3.f44088Z;
            if (view2 != null) {
                view2.setVisibility(z4 ? 0 : 8);
            }
            fdVar3.a(dVar.f44466a, dVar.f44468c);
            ArrayList arrayList = dVar.f44473h;
            boolean z5 = dVar.f44474i;
            View view3 = fdVar3.f44110p;
            if (view3 != null) {
                view3.setVisibility(8);
            }
            View view4 = fdVar3.f44087Y;
            if (view4 != null) {
                view4.setVisibility(z5 ? 0 : 8);
            }
            int size = arrayList.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    obj2 = null;
                    break;
                }
                obj2 = arrayList.get(i6);
                i6++;
                if (((ml) obj2) instanceof ml.a) {
                    break;
                }
            }
            ml mlVar2 = (ml) obj2;
            if (mlVar2 == null) {
                int size2 = arrayList.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size2) {
                        obj3 = null;
                        break;
                    }
                    obj3 = arrayList.get(i7);
                    i7++;
                    if (((ml) obj3) instanceof ml.c) {
                        break;
                    }
                }
                mlVar2 = (ml) obj3;
                if (mlVar2 == null) {
                    int size3 = arrayList.size();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= size3) {
                            obj4 = null;
                            break;
                        }
                        obj4 = arrayList.get(i8);
                        i8++;
                        if (((ml) obj4) instanceof ml.b) {
                            break;
                        }
                    }
                    mlVar2 = (ml) obj4;
                }
            }
            TextView textView15 = fdVar3.f44106l;
            String str2 = "";
            if (textView15 != null) {
                if (mlVar2 instanceof ml.a) {
                    str = fdVar3.getString(R.string.sdk_pay_subs_promo_period_price_title, fdVar3.a(((ml.a) mlVar2).f44652b));
                } else if (mlVar2 instanceof ml.c) {
                    ml.c cVar = (ml.c) mlVar2;
                    String string2 = fdVar3.getString(R.string.sdk_pay_subs_start_period_price_title, fdVar3.a(cVar.f44656b), cVar.f44655a);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.sdk_p…rtInterval, tariff.price)");
                    str = fd.a(string2);
                } else if (mlVar2 instanceof ml.b) {
                    ml.b bVar2 = (ml.b) mlVar2;
                    String string3 = fdVar3.getString(R.string.sdk_pay_subs_standard_period_price_title, bVar2.f44653a, fdVar3.a(bVar2.f44654b));
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.sdk_p….price, standardInterval)");
                    str = fd.a(string3);
                } else {
                    if (mlVar2 != null) {
                        throw new W1.m();
                    }
                    str = "";
                }
                textView15.setText(str);
            }
            ArrayList arrayList2 = new ArrayList();
            int size4 = arrayList.size();
            int i9 = 0;
            while (i9 < size4) {
                Object obj5 = arrayList.get(i9);
                i9++;
                if (obj5 instanceof ml.a) {
                    arrayList2.add(obj5);
                }
            }
            ml.a aVar2 = (ml.a) CollectionsKt.firstOrNull((List) arrayList2);
            ArrayList arrayList3 = new ArrayList();
            int size5 = arrayList.size();
            int i10 = 0;
            while (i10 < size5) {
                Object obj6 = arrayList.get(i10);
                i10++;
                if (obj6 instanceof ml.c) {
                    arrayList3.add(obj6);
                }
            }
            ml.c cVar2 = (ml.c) CollectionsKt.firstOrNull((List) arrayList3);
            ArrayList arrayList4 = new ArrayList();
            int size6 = arrayList.size();
            int i11 = 0;
            while (i11 < size6) {
                Object obj7 = arrayList.get(i11);
                i11++;
                if (obj7 instanceof ml.b) {
                    arrayList4.add(obj7);
                }
            }
            ml.b bVar3 = (ml.b) CollectionsKt.firstOrNull((List) arrayList4);
            TextView textView16 = fdVar3.f44108n;
            if (textView16 != null) {
                if (aVar2 == null || cVar2 == null || bVar3 == null) {
                    string = ((aVar2 == null && cVar2 == null) || bVar3 == null) ? bVar3 != null ? fdVar3.getString(R.string.sdk_pay_subs_standard_period_purchase_interval_title) : "" : fdVar3.getString(R.string.sdk_pay_subs_start_period_purchase_interval_title, bVar3.f44653a);
                } else {
                    String string4 = fdVar3.getString(R.string.sdk_pay_subs_start_period_details_title, cVar2.f44655a);
                    Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.sdk_p…title, startTariff.price)");
                    string = fdVar3.getString(R.string.sdk_pay_subs_combine_period_purchase_interval_title, string4, bVar3.f44653a);
                }
                textView16.setText(string);
            }
            View view5 = fdVar3.f44077O;
            if (view5 != null) {
                view5.setVisibility(aVar2 != null ? 0 : 8);
            }
            String a4 = aVar2 != null ? fdVar3.a(aVar2.f44652b) : null;
            TextView textView17 = fdVar3.f44078P;
            if (textView17 != null) {
                if (a4 == null) {
                    a4 = null;
                } else if (aVar2.f44652b.getCount() == 1) {
                    a4 = fd.a(a4);
                }
                textView17.setText(a4);
            }
            TextView textView18 = fdVar3.f44079Q;
            if (textView18 != null) {
                textView18.setText(aVar2 != null ? aVar2.f44651a : null);
            }
            View view6 = fdVar3.f44080R;
            if (view6 != null) {
                view6.setVisibility(cVar2 != null ? 0 : 8);
            }
            String a5 = cVar2 != null ? fdVar3.a(cVar2.f44656b) : null;
            TextView textView19 = fdVar3.f44081S;
            if (textView19 != null) {
                textView19.setText(a5 != null ? aVar2 != null ? fdVar3.getString(R.string.sdk_pay_subs_start_period_details_title, a5) : fd.a(a5) : null);
            }
            TextView textView20 = fdVar3.f44082T;
            if (textView20 != null) {
                textView20.setText(cVar2 != null ? cVar2.f44655a : null);
            }
            View view7 = fdVar3.f44083U;
            if (view7 != null) {
                view7.setVisibility(bVar3 != null ? 0 : 8);
            }
            String a6 = bVar3 != null ? fdVar3.a(bVar3.f44654b) : null;
            TextView textView21 = fdVar3.f44084V;
            if (textView21 != null) {
                textView21.setText(a6 != null ? (aVar2 == null && cVar2 == null) ? fdVar3.getString(R.string.sdk_pay_subs_single_standard_period_details_title, a6) : fdVar3.getString(R.string.sdk_pay_subs_standard_period_details_title, a6) : null);
            }
            TextView textView22 = fdVar3.f44085W;
            if (textView22 != null) {
                textView22.setText(bVar3 != null ? bVar3.f44653a : null);
            }
            TextView textView23 = fdVar3.f44086X;
            if (textView23 != null) {
                if (aVar2 != null) {
                    str2 = aVar2.f44651a;
                } else if (cVar2 != null) {
                    str2 = cVar2.f44655a;
                } else if (bVar3 != null) {
                    str2 = bVar3.f44653a;
                }
                textView23.setText(str2);
            }
            Button button = fdVar3.f44068F;
            if (button != null) {
                Resources resources = fdVar3.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "resources");
                button.setText(yl.a(mlVar, resources));
            }
            FrameLayout frameLayout = fdVar3.f44067E;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            FrameLayout frameLayout2 = fdVar3.f44069G;
            if (frameLayout2 == null) {
                i4 = 8;
            } else {
                i4 = 8;
                frameLayout2.setVisibility(8);
            }
            FrameLayout frameLayout3 = fdVar3.f44071I;
            if (frameLayout3 != null) {
                frameLayout3.setVisibility(i4);
            }
            if (z4) {
                if (dVar.f44470e) {
                    int i12 = R.string.sdk_pay_subs_promo_period_purchase_with_offer_title;
                    int i13 = R.string.sdk_pay_offer_link_text;
                    TextView textView24 = fdVar3.f44090a0;
                    id idVar = new id((ld) fdVar3.f44089a.getValue());
                    String string5 = fdVar3.requireContext().getString(i12);
                    Intrinsics.checkNotNullExpressionValue(string5, "requireContext().getString(fullTextResource)");
                    SpannableString spannableString = new SpannableString(string5);
                    String string6 = fdVar3.requireContext().getString(i13);
                    Intrinsics.checkNotNullExpressionValue(string6, "requireContext().getString(linkStringResource)");
                    int c02 = StringsKt.c0(string5, string6, 0, false, 6, null);
                    spannableString.setSpan(new zc(idVar, fdVar3), c02, string6.length() + c02, 33);
                    if (textView24 != null) {
                        textView24.setText(spannableString);
                    }
                    if (textView24 != null) {
                        textView24.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                } else {
                    TextView textView25 = fdVar3.f44090a0;
                    if (textView25 != null) {
                        textView25.setText(fdVar3.requireContext().getString(R.string.sdk_pay_subs_promo_period_purchase_title));
                    }
                }
            }
            ze zeVar2 = dVar.f44467b.f44822g;
            ImageView imageView3 = fdVar3.f44102h;
            if (imageView3 != null) {
                q6.a(imageView3, zeVar2.getIcon().getValue(), Integer.valueOf(R.drawable.sdk_pay_ic_product_image_placeholder), fdVar3.getResources().getDimension(R.dimen.sdk_pay_bottom_sheet_image_product_radius));
            }
            TextView textView26 = fdVar3.f44103i;
            if (textView26 != null) {
                textView26.setText(zeVar2.getTitle().getValue());
            }
            TextView textView27 = fdVar3.f44104j;
            if (textView27 != null) {
                textView27.setText(fdVar3.getString(R.string.sdk_pay_subscription_purchase_subtitle));
            }
            fdVar3.a(dVar.f44475j);
        } else if (state instanceof kd.c) {
            fd fdVar4 = this.f44171a;
            LinearLayout linearLayout7 = fdVar4.f44099f;
            if (linearLayout7 != null) {
                linearLayout7.setVisibility(0);
            }
            LinearLayout linearLayout8 = fdVar4.f44101g;
            if (linearLayout8 != null) {
                linearLayout8.setVisibility(8);
            }
        }
        return Unit.f41027a;
    }
}
