package v2;

import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.u;
import com.google.android.material.card.MaterialCardView;
import com.oriondriftchasers.arordrft.R;
import java.util.Arrays;
import l2.m;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class g extends u {
    public m Y;

    @Override // androidx.fragment.app.u
    public final View s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        f3.d.e(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_utility_calculator, viewGroup, false);
        int i = R.id.asteroid_density_input_field;
        EditText editText = (EditText) h.a.s(inflate, R.id.asteroid_density_input_field);
        if (editText != null) {
            i = R.id.calculate_drift_button;
            Button button = (Button) h.a.s(inflate, R.id.calculate_drift_button);
            if (button != null) {
                i = R.id.distance_input_field;
                EditText editText2 = (EditText) h.a.s(inflate, R.id.distance_input_field);
                if (editText2 != null) {
                    i = R.id.input_fields_card;
                    if (((MaterialCardView) h.a.s(inflate, R.id.input_fields_card)) != null) {
                        i = R.id.mass_input_field;
                        EditText editText3 = (EditText) h.a.s(inflate, R.id.mass_input_field);
                        if (editText3 != null) {
                            i = R.id.reset_calculator_button;
                            Button button2 = (Button) h.a.s(inflate, R.id.reset_calculator_button);
                            if (button2 != null) {
                                i = R.id.result_drift_angle_text;
                                TextView textView = (TextView) h.a.s(inflate, R.id.result_drift_angle_text);
                                if (textView != null) {
                                    i = R.id.result_fuel_efficiency_text;
                                    TextView textView2 = (TextView) h.a.s(inflate, R.id.result_fuel_efficiency_text);
                                    if (textView2 != null) {
                                        i = R.id.result_kinetic_energy_text;
                                        TextView textView3 = (TextView) h.a.s(inflate, R.id.result_kinetic_energy_text);
                                        if (textView3 != null) {
                                            i = R.id.result_optimal_speed_text;
                                            TextView textView4 = (TextView) h.a.s(inflate, R.id.result_optimal_speed_text);
                                            if (textView4 != null) {
                                                i = R.id.result_safety_rating_text;
                                                TextView textView5 = (TextView) h.a.s(inflate, R.id.result_safety_rating_text);
                                                if (textView5 != null) {
                                                    i = R.id.results_container_card;
                                                    MaterialCardView materialCardView = (MaterialCardView) h.a.s(inflate, R.id.results_container_card);
                                                    if (materialCardView != null) {
                                                        i = R.id.utility_description_text;
                                                        if (((TextView) h.a.s(inflate, R.id.utility_description_text)) != null) {
                                                            i = R.id.utility_title_header;
                                                            if (((TextView) h.a.s(inflate, R.id.utility_title_header)) != null) {
                                                                i = R.id.velocity_input_field;
                                                                EditText editText4 = (EditText) h.a.s(inflate, R.id.velocity_input_field);
                                                                if (editText4 != null) {
                                                                    ScrollView scrollView = (ScrollView) inflate;
                                                                    this.Y = new m(scrollView, editText, button, editText2, editText3, button2, textView, textView2, textView3, textView4, textView5, materialCardView, editText4);
                                                                    f3.d.d(scrollView, "getRoot(...)");
                                                                    return scrollView;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // androidx.fragment.app.u
    public final void t() {
        this.H = true;
        this.Y = null;
    }

    @Override // androidx.fragment.app.u
    public final void z(View view, Bundle bundle) {
        f3.d.e(view, "view");
        m mVar = this.Y;
        f3.d.b(mVar);
        final int i = 0;
        ((Button) mVar.f2619b).setOnClickListener(new View.OnClickListener(this) { // from class: v2.f

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ g f3509g;

            {
                this.f3509g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        g gVar = this.f3509g;
                        try {
                            m mVar2 = gVar.Y;
                            f3.d.b(mVar2);
                            Double u02 = m3.d.u0(((EditText) mVar2.f2627l).getText().toString());
                            m mVar3 = gVar.Y;
                            f3.d.b(mVar3);
                            Double u03 = m3.d.u0(((EditText) mVar3.d).getText().toString());
                            m mVar4 = gVar.Y;
                            f3.d.b(mVar4);
                            Double u04 = m3.d.u0(((EditText) mVar4.f2618a).getText().toString());
                            m mVar5 = gVar.Y;
                            f3.d.b(mVar5);
                            Double u05 = m3.d.u0(((EditText) mVar5.f2620c).getText().toString());
                            if (u02 != null && u03 != null && u04 != null && u05 != null) {
                                if (u02.doubleValue() > 0.0d && u03.doubleValue() > 0.0d && u04.doubleValue() > 0.0d && u05.doubleValue() > 0.0d) {
                                    double doubleValue = u03.doubleValue() * 0.5d * Math.pow(u02.doubleValue(), 2);
                                    double d = 100;
                                    double doubleValue2 = (u02.doubleValue() * u04.doubleValue()) / (u03.doubleValue() + d);
                                    double sqrt = Math.sqrt(u05.doubleValue() * 9.81d * u04.doubleValue());
                                    String str = u02.doubleValue() < 1.2d * sqrt ? "✅ Safe" : "⚠️ Risky";
                                    double doubleValue3 = (1 - (u04.doubleValue() / d)) * (u05.doubleValue() / u02.doubleValue());
                                    m mVar6 = gVar.Y;
                                    f3.d.b(mVar6);
                                    ((TextView) mVar6.f2624h).setText("⚡ Kinetic Energy: " + String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(doubleValue)}, 1)) + " MJ");
                                    m mVar7 = gVar.Y;
                                    f3.d.b(mVar7);
                                    ((TextView) mVar7.f2622f).setText("📐 Drift Angle: " + String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(doubleValue2)}, 1)) + "°");
                                    m mVar8 = gVar.Y;
                                    f3.d.b(mVar8);
                                    ((TextView) mVar8.i).setText("🎯 Optimal Speed: " + String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(sqrt)}, 1)) + " km/s");
                                    m mVar9 = gVar.Y;
                                    f3.d.b(mVar9);
                                    ((TextView) mVar9.f2625j).setText("🛡️ Safety Rating: ".concat(str));
                                    m mVar10 = gVar.Y;
                                    f3.d.b(mVar10);
                                    ((TextView) mVar10.f2623g).setText("⛽ Fuel Efficiency: " + String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(doubleValue3)}, 1)) + " units");
                                    m mVar11 = gVar.Y;
                                    f3.d.b(mVar11);
                                    ((MaterialCardView) mVar11.f2626k).setVisibility(0);
                                    break;
                                }
                                Toast.makeText(gVar.h(), "⚠️ Values must be positive", 0).show();
                            }
                            Toast.makeText(gVar.h(), "⚠️ Please fill all fields", 0).show();
                        } catch (Exception unused) {
                            Toast.makeText(gVar.h(), "❌ Calculation error", 0).show();
                            return;
                        }
                        break;
                    default:
                        g gVar2 = this.f3509g;
                        m mVar12 = gVar2.Y;
                        f3.d.b(mVar12);
                        Editable text = ((EditText) mVar12.f2627l).getText();
                        if (text != null) {
                            text.clear();
                        }
                        m mVar13 = gVar2.Y;
                        f3.d.b(mVar13);
                        Editable text2 = ((EditText) mVar13.d).getText();
                        if (text2 != null) {
                            text2.clear();
                        }
                        m mVar14 = gVar2.Y;
                        f3.d.b(mVar14);
                        Editable text3 = ((EditText) mVar14.f2618a).getText();
                        if (text3 != null) {
                            text3.clear();
                        }
                        m mVar15 = gVar2.Y;
                        f3.d.b(mVar15);
                        Editable text4 = ((EditText) mVar15.f2620c).getText();
                        if (text4 != null) {
                            text4.clear();
                        }
                        m mVar16 = gVar2.Y;
                        f3.d.b(mVar16);
                        ((MaterialCardView) mVar16.f2626k).setVisibility(8);
                        break;
                }
            }
        });
        m mVar2 = this.Y;
        f3.d.b(mVar2);
        final int i4 = 1;
        ((Button) mVar2.f2621e).setOnClickListener(new View.OnClickListener(this) { // from class: v2.f

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ g f3509g;

            {
                this.f3509g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        g gVar = this.f3509g;
                        try {
                            m mVar22 = gVar.Y;
                            f3.d.b(mVar22);
                            Double u02 = m3.d.u0(((EditText) mVar22.f2627l).getText().toString());
                            m mVar3 = gVar.Y;
                            f3.d.b(mVar3);
                            Double u03 = m3.d.u0(((EditText) mVar3.d).getText().toString());
                            m mVar4 = gVar.Y;
                            f3.d.b(mVar4);
                            Double u04 = m3.d.u0(((EditText) mVar4.f2618a).getText().toString());
                            m mVar5 = gVar.Y;
                            f3.d.b(mVar5);
                            Double u05 = m3.d.u0(((EditText) mVar5.f2620c).getText().toString());
                            if (u02 != null && u03 != null && u04 != null && u05 != null) {
                                if (u02.doubleValue() > 0.0d && u03.doubleValue() > 0.0d && u04.doubleValue() > 0.0d && u05.doubleValue() > 0.0d) {
                                    double doubleValue = u03.doubleValue() * 0.5d * Math.pow(u02.doubleValue(), 2);
                                    double d = 100;
                                    double doubleValue2 = (u02.doubleValue() * u04.doubleValue()) / (u03.doubleValue() + d);
                                    double sqrt = Math.sqrt(u05.doubleValue() * 9.81d * u04.doubleValue());
                                    String str = u02.doubleValue() < 1.2d * sqrt ? "✅ Safe" : "⚠️ Risky";
                                    double doubleValue3 = (1 - (u04.doubleValue() / d)) * (u05.doubleValue() / u02.doubleValue());
                                    m mVar6 = gVar.Y;
                                    f3.d.b(mVar6);
                                    ((TextView) mVar6.f2624h).setText("⚡ Kinetic Energy: " + String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(doubleValue)}, 1)) + " MJ");
                                    m mVar7 = gVar.Y;
                                    f3.d.b(mVar7);
                                    ((TextView) mVar7.f2622f).setText("📐 Drift Angle: " + String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(doubleValue2)}, 1)) + "°");
                                    m mVar8 = gVar.Y;
                                    f3.d.b(mVar8);
                                    ((TextView) mVar8.i).setText("🎯 Optimal Speed: " + String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(sqrt)}, 1)) + " km/s");
                                    m mVar9 = gVar.Y;
                                    f3.d.b(mVar9);
                                    ((TextView) mVar9.f2625j).setText("🛡️ Safety Rating: ".concat(str));
                                    m mVar10 = gVar.Y;
                                    f3.d.b(mVar10);
                                    ((TextView) mVar10.f2623g).setText("⛽ Fuel Efficiency: " + String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(doubleValue3)}, 1)) + " units");
                                    m mVar11 = gVar.Y;
                                    f3.d.b(mVar11);
                                    ((MaterialCardView) mVar11.f2626k).setVisibility(0);
                                    break;
                                }
                                Toast.makeText(gVar.h(), "⚠️ Values must be positive", 0).show();
                            }
                            Toast.makeText(gVar.h(), "⚠️ Please fill all fields", 0).show();
                        } catch (Exception unused) {
                            Toast.makeText(gVar.h(), "❌ Calculation error", 0).show();
                            return;
                        }
                        break;
                    default:
                        g gVar2 = this.f3509g;
                        m mVar12 = gVar2.Y;
                        f3.d.b(mVar12);
                        Editable text = ((EditText) mVar12.f2627l).getText();
                        if (text != null) {
                            text.clear();
                        }
                        m mVar13 = gVar2.Y;
                        f3.d.b(mVar13);
                        Editable text2 = ((EditText) mVar13.d).getText();
                        if (text2 != null) {
                            text2.clear();
                        }
                        m mVar14 = gVar2.Y;
                        f3.d.b(mVar14);
                        Editable text3 = ((EditText) mVar14.f2618a).getText();
                        if (text3 != null) {
                            text3.clear();
                        }
                        m mVar15 = gVar2.Y;
                        f3.d.b(mVar15);
                        Editable text4 = ((EditText) mVar15.f2620c).getText();
                        if (text4 != null) {
                            text4.clear();
                        }
                        m mVar16 = gVar2.Y;
                        f3.d.b(mVar16);
                        ((MaterialCardView) mVar16.f2626k).setVisibility(8);
                        break;
                }
            }
        });
    }
}
