package P0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c1.InterfaceC0085a;
import com.playbag.tripgear.ChecklistActivity;
import com.playbag.tripgear.HomeActivity;
import com.playbag.tripgear.MainActivity2;
import com.playbag.tripgear.R;
import com.playbag.tripgear.RulesActivity;
import com.playbag.tripgear.SummaryActivity;
import com.playbag.tripgear.TripSelectActivity;
import g.AbstractActivityC0106i;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements InterfaceC0085a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f685a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0106i f686b;

    public /* synthetic */ d(AbstractActivityC0106i abstractActivityC0106i, int i) {
        this.f685a = i;
        this.f686b = abstractActivityC0106i;
    }

    @Override // c1.InterfaceC0085a
    public final Object b() {
        int i = R.id.btnBack;
        int i2 = R.id.tvTitle;
        AbstractActivityC0106i abstractActivityC0106i = this.f686b;
        switch (this.f685a) {
            case 0:
                int i3 = ChecklistActivity.f1988D;
                View inflate = ((ChecklistActivity) abstractActivityC0106i).getLayoutInflater().inflate(R.layout.activity_checklist, (ViewGroup) null, false);
                TextView textView = (TextView) h1.d.f(inflate, R.id.btnAddItem);
                if (textView != null) {
                    TextView textView2 = (TextView) h1.d.f(inflate, R.id.btnBack);
                    if (textView2 != null) {
                        i = R.id.btnDone;
                        TextView textView3 = (TextView) h1.d.f(inflate, R.id.btnDone);
                        if (textView3 != null) {
                            i = R.id.btnReset;
                            TextView textView4 = (TextView) h1.d.f(inflate, R.id.btnReset);
                            if (textView4 != null) {
                                i = R.id.etNewItem;
                                EditText editText = (EditText) h1.d.f(inflate, R.id.etNewItem);
                                if (editText != null) {
                                    i = R.id.progressBar;
                                    ProgressBar progressBar = (ProgressBar) h1.d.f(inflate, R.id.progressBar);
                                    if (progressBar != null) {
                                        i = R.id.rvChecklist;
                                        RecyclerView recyclerView = (RecyclerView) h1.d.f(inflate, R.id.rvChecklist);
                                        if (recyclerView != null) {
                                            i = R.id.tvProgress;
                                            TextView textView5 = (TextView) h1.d.f(inflate, R.id.tvProgress);
                                            if (textView5 != null) {
                                                i = R.id.tvTripTitle;
                                                TextView textView6 = (TextView) h1.d.f(inflate, R.id.tvTripTitle);
                                                if (textView6 != null) {
                                                    return new Q0.a((LinearLayout) inflate, textView, textView2, textView3, textView4, editText, progressBar, recyclerView, textView5, textView6);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    i = R.id.btnAddItem;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
            case 1:
                int i4 = HomeActivity.f1994z;
                View inflate2 = ((HomeActivity) abstractActivityC0106i).getLayoutInflater().inflate(R.layout.activity_home, (ViewGroup) null, false);
                int i5 = R.id.btnHelp;
                TextView textView7 = (TextView) h1.d.f(inflate2, R.id.btnHelp);
                if (textView7 != null) {
                    i5 = R.id.btnStart;
                    TextView textView8 = (TextView) h1.d.f(inflate2, R.id.btnStart);
                    if (textView8 != null) {
                        i5 = R.id.ivBag;
                        if (((ImageView) h1.d.f(inflate2, R.id.ivBag)) != null) {
                            i5 = R.id.tvSubtitle;
                            if (((TextView) h1.d.f(inflate2, R.id.tvSubtitle)) != null) {
                                if (((TextView) h1.d.f(inflate2, R.id.tvTitle)) != null) {
                                    return new Q0.b((FrameLayout) inflate2, textView7, textView8);
                                }
                                throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i2)));
                            }
                        }
                    }
                }
                i2 = i5;
                throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i2)));
            case 2:
                int i6 = MainActivity2.f2003z;
                View inflate3 = ((MainActivity2) abstractActivityC0106i).getLayoutInflater().inflate(R.layout.activity_main2, (ViewGroup) null, false);
                if (inflate3 != null) {
                    return new Q0.c((FrameLayout) inflate3);
                }
                throw new NullPointerException("rootView");
            case 3:
                int i7 = RulesActivity.f2005z;
                View inflate4 = ((RulesActivity) abstractActivityC0106i).getLayoutInflater().inflate(R.layout.activity_rules, (ViewGroup) null, false);
                int i8 = R.id.btnGotIt;
                TextView textView9 = (TextView) h1.d.f(inflate4, R.id.btnGotIt);
                if (textView9 != null) {
                    i8 = R.id.tvBody;
                    if (((TextView) h1.d.f(inflate4, R.id.tvBody)) != null) {
                        if (((TextView) h1.d.f(inflate4, R.id.tvTitle)) != null) {
                            return new Q0.e((FrameLayout) inflate4, textView9);
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate4.getResources().getResourceName(i2)));
                    }
                }
                i2 = i8;
                throw new NullPointerException("Missing required view with ID: ".concat(inflate4.getResources().getResourceName(i2)));
            case 4:
                int i9 = SummaryActivity.f2007z;
                View inflate5 = ((SummaryActivity) abstractActivityC0106i).getLayoutInflater().inflate(R.layout.activity_summary, (ViewGroup) null, false);
                int i10 = R.id.btnEditList;
                TextView textView10 = (TextView) h1.d.f(inflate5, R.id.btnEditList);
                if (textView10 != null) {
                    i10 = R.id.btnHome;
                    TextView textView11 = (TextView) h1.d.f(inflate5, R.id.btnHome);
                    if (textView11 != null) {
                        i10 = R.id.btnNewTrip;
                        TextView textView12 = (TextView) h1.d.f(inflate5, R.id.btnNewTrip);
                        if (textView12 != null) {
                            i10 = R.id.tvItemCount;
                            TextView textView13 = (TextView) h1.d.f(inflate5, R.id.tvItemCount);
                            if (textView13 != null) {
                                i10 = R.id.tvOutcome;
                                TextView textView14 = (TextView) h1.d.f(inflate5, R.id.tvOutcome);
                                if (textView14 != null) {
                                    i10 = R.id.tvTripName;
                                    TextView textView15 = (TextView) h1.d.f(inflate5, R.id.tvTripName);
                                    if (textView15 != null) {
                                        return new Q0.f((FrameLayout) inflate5, textView10, textView11, textView12, textView13, textView14, textView15);
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate5.getResources().getResourceName(i10)));
            default:
                int i11 = TripSelectActivity.f2009z;
                View inflate6 = ((TripSelectActivity) abstractActivityC0106i).getLayoutInflater().inflate(R.layout.activity_trip_select, (ViewGroup) null, false);
                TextView textView16 = (TextView) h1.d.f(inflate6, R.id.btnBack);
                if (textView16 != null) {
                    i = R.id.btnBusiness;
                    TextView textView17 = (TextView) h1.d.f(inflate6, R.id.btnBusiness);
                    if (textView17 != null) {
                        i = R.id.btnMountains;
                        TextView textView18 = (TextView) h1.d.f(inflate6, R.id.btnMountains);
                        if (textView18 != null) {
                            i = R.id.btnSea;
                            TextView textView19 = (TextView) h1.d.f(inflate6, R.id.btnSea);
                            if (textView19 != null) {
                                if (((TextView) h1.d.f(inflate6, R.id.tvTitle)) != null) {
                                    return new Q0.g((FrameLayout) inflate6, textView16, textView17, textView18, textView19);
                                }
                                i = R.id.tvTitle;
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate6.getResources().getResourceName(i)));
        }
    }
}
