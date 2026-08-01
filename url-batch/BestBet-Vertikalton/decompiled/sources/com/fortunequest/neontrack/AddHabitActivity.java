package com.fortunequest.neontrack;

import X0.f;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.fortunequest.neontrack.AddHabitActivity;
import com.fortunequest.neontrack.R;
import com.fortunequest.neontrack.data.FortuneQuestDatabase;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import g.AbstractActivityC0128i;
import j1.InterfaceC0170a;
import s1.AbstractC0335s;
import t0.C0350c;
import t0.C0353f;
import t0.C0355h;
import u0.C0383v;
import v0.C0389a;

/* loaded from: classes.dex */
public final class AddHabitActivity extends AbstractActivityC0128i {

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f2069B = 0;

    /* renamed from: A, reason: collision with root package name */
    public final C0353f f2070A = new C0353f(new C0350c(this));

    /* renamed from: y, reason: collision with root package name */
    public final f f2071y;

    /* renamed from: z, reason: collision with root package name */
    public final f f2072z;

    public AddHabitActivity() {
        final int i = 0;
        this.f2071y = new f(new InterfaceC0170a(this) { // from class: t0.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddHabitActivity f4120b;

            {
                this.f4120b = this;
            }

            @Override // j1.InterfaceC0170a
            public final Object c() {
                AddHabitActivity addHabitActivity = this.f4120b;
                switch (i) {
                    case 0:
                        int i2 = AddHabitActivity.f2069B;
                        View inflate = addHabitActivity.getLayoutInflater().inflate(R.layout.activity_add_habit, (ViewGroup) null, false);
                        int i3 = R.id.btnBackFromAdd;
                        MaterialButton materialButton = (MaterialButton) b1.g.l(inflate, R.id.btnBackFromAdd);
                        if (materialButton != null) {
                            i3 = R.id.btnSaveHabit;
                            MaterialButton materialButton2 = (MaterialButton) b1.g.l(inflate, R.id.btnSaveHabit);
                            if (materialButton2 != null) {
                                i3 = R.id.habitNameInput;
                                TextInputEditText textInputEditText = (TextInputEditText) b1.g.l(inflate, R.id.habitNameInput);
                                if (textInputEditText != null) {
                                    i3 = R.id.habitsList;
                                    RecyclerView recyclerView = (RecyclerView) b1.g.l(inflate, R.id.habitsList);
                                    if (recyclerView != null) {
                                        i3 = R.id.sym0;
                                        if (((RadioButton) b1.g.l(inflate, R.id.sym0)) != null) {
                                            i3 = R.id.sym1;
                                            if (((RadioButton) b1.g.l(inflate, R.id.sym1)) != null) {
                                                i3 = R.id.sym2;
                                                if (((RadioButton) b1.g.l(inflate, R.id.sym2)) != null) {
                                                    i3 = R.id.sym3;
                                                    if (((RadioButton) b1.g.l(inflate, R.id.sym3)) != null) {
                                                        i3 = R.id.sym4;
                                                        if (((RadioButton) b1.g.l(inflate, R.id.sym4)) != null) {
                                                            i3 = R.id.sym5;
                                                            if (((RadioButton) b1.g.l(inflate, R.id.sym5)) != null) {
                                                                i3 = R.id.symbolGroup;
                                                                RadioGroup radioGroup = (RadioGroup) b1.g.l(inflate, R.id.symbolGroup);
                                                                if (radioGroup != null) {
                                                                    return new C0389a((FrameLayout) inflate, materialButton, materialButton2, textInputEditText, recyclerView, radioGroup);
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
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                    default:
                        int i4 = AddHabitActivity.f2069B;
                        return new C0383v(FortuneQuestDatabase.f2094l.a(addHabitActivity));
                }
            }
        });
        final int i2 = 1;
        this.f2072z = new f(new InterfaceC0170a(this) { // from class: t0.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddHabitActivity f4120b;

            {
                this.f4120b = this;
            }

            @Override // j1.InterfaceC0170a
            public final Object c() {
                AddHabitActivity addHabitActivity = this.f4120b;
                switch (i2) {
                    case 0:
                        int i22 = AddHabitActivity.f2069B;
                        View inflate = addHabitActivity.getLayoutInflater().inflate(R.layout.activity_add_habit, (ViewGroup) null, false);
                        int i3 = R.id.btnBackFromAdd;
                        MaterialButton materialButton = (MaterialButton) b1.g.l(inflate, R.id.btnBackFromAdd);
                        if (materialButton != null) {
                            i3 = R.id.btnSaveHabit;
                            MaterialButton materialButton2 = (MaterialButton) b1.g.l(inflate, R.id.btnSaveHabit);
                            if (materialButton2 != null) {
                                i3 = R.id.habitNameInput;
                                TextInputEditText textInputEditText = (TextInputEditText) b1.g.l(inflate, R.id.habitNameInput);
                                if (textInputEditText != null) {
                                    i3 = R.id.habitsList;
                                    RecyclerView recyclerView = (RecyclerView) b1.g.l(inflate, R.id.habitsList);
                                    if (recyclerView != null) {
                                        i3 = R.id.sym0;
                                        if (((RadioButton) b1.g.l(inflate, R.id.sym0)) != null) {
                                            i3 = R.id.sym1;
                                            if (((RadioButton) b1.g.l(inflate, R.id.sym1)) != null) {
                                                i3 = R.id.sym2;
                                                if (((RadioButton) b1.g.l(inflate, R.id.sym2)) != null) {
                                                    i3 = R.id.sym3;
                                                    if (((RadioButton) b1.g.l(inflate, R.id.sym3)) != null) {
                                                        i3 = R.id.sym4;
                                                        if (((RadioButton) b1.g.l(inflate, R.id.sym4)) != null) {
                                                            i3 = R.id.sym5;
                                                            if (((RadioButton) b1.g.l(inflate, R.id.sym5)) != null) {
                                                                i3 = R.id.symbolGroup;
                                                                RadioGroup radioGroup = (RadioGroup) b1.g.l(inflate, R.id.symbolGroup);
                                                                if (radioGroup != null) {
                                                                    return new C0389a((FrameLayout) inflate, materialButton, materialButton2, textInputEditText, recyclerView, radioGroup);
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
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                    default:
                        int i4 = AddHabitActivity.f2069B;
                        return new C0383v(FortuneQuestDatabase.f2094l.a(addHabitActivity));
                }
            }
        });
    }

    @Override // g.AbstractActivityC0128i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(t().f4439a);
        t().f4442e.setLayoutManager(new LinearLayoutManager(1));
        t().f4442e.setAdapter(this.f2070A);
        final int i = 0;
        t().f4441c.setOnClickListener(new View.OnClickListener(this) { // from class: t0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddHabitActivity f4118b;

            {
                this.f4118b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String obj;
                AddHabitActivity addHabitActivity = this.f4118b;
                switch (i) {
                    case 0:
                        int i2 = AddHabitActivity.f2069B;
                        Editable text = addHabitActivity.t().d.getText();
                        String obj2 = (text == null || (obj = text.toString()) == null) ? null : r1.d.T(obj).toString();
                        if (obj2 == null) {
                            obj2 = "";
                        }
                        if (obj2.length() != 0) {
                            int checkedRadioButtonId = addHabitActivity.t().f4443f.getCheckedRadioButtonId();
                            AbstractC0335s.g(J.e(addHabitActivity), null, new C0356i(addHabitActivity, obj2, checkedRadioButtonId == R.id.sym1 ? 1 : checkedRadioButtonId == R.id.sym2 ? 2 : checkedRadioButtonId == R.id.sym3 ? 3 : checkedRadioButtonId == R.id.sym4 ? 4 : checkedRadioButtonId == R.id.sym5 ? 5 : 0, null), 3);
                            break;
                        } else {
                            addHabitActivity.t().d.setError(addHabitActivity.getString(R.string.habit_name_hint));
                            break;
                        }
                        break;
                    default:
                        int i3 = AddHabitActivity.f2069B;
                        addHabitActivity.finish();
                        break;
                }
            }
        });
        final int i2 = 1;
        t().f4440b.setOnClickListener(new View.OnClickListener(this) { // from class: t0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddHabitActivity f4118b;

            {
                this.f4118b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String obj;
                AddHabitActivity addHabitActivity = this.f4118b;
                switch (i2) {
                    case 0:
                        int i22 = AddHabitActivity.f2069B;
                        Editable text = addHabitActivity.t().d.getText();
                        String obj2 = (text == null || (obj = text.toString()) == null) ? null : r1.d.T(obj).toString();
                        if (obj2 == null) {
                            obj2 = "";
                        }
                        if (obj2.length() != 0) {
                            int checkedRadioButtonId = addHabitActivity.t().f4443f.getCheckedRadioButtonId();
                            AbstractC0335s.g(J.e(addHabitActivity), null, new C0356i(addHabitActivity, obj2, checkedRadioButtonId == R.id.sym1 ? 1 : checkedRadioButtonId == R.id.sym2 ? 2 : checkedRadioButtonId == R.id.sym3 ? 3 : checkedRadioButtonId == R.id.sym4 ? 4 : checkedRadioButtonId == R.id.sym5 ? 5 : 0, null), 3);
                            break;
                        } else {
                            addHabitActivity.t().d.setError(addHabitActivity.getString(R.string.habit_name_hint));
                            break;
                        }
                        break;
                    default:
                        int i3 = AddHabitActivity.f2069B;
                        addHabitActivity.finish();
                        break;
                }
            }
        });
        u();
    }

    public final C0389a t() {
        return (C0389a) this.f2071y.a();
    }

    public final void u() {
        AbstractC0335s.g(J.e(this), null, new C0355h(this, null), 3);
    }
}
