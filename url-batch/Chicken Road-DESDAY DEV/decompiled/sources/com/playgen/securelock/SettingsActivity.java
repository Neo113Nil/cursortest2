package com.playgen.securelock;

import C.g;
import O0.h;
import P0.b;
import P0.c;
import S0.e;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.Toast;
import b1.d;
import com.playgen.securelock.R;
import com.playgen.securelock.SettingsActivity;
import g.AbstractActivityC0133i;
import u1.l;

/* loaded from: classes.dex */
public final class SettingsActivity extends AbstractActivityC0133i {

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f1940C = 0;

    /* renamed from: A, reason: collision with root package name */
    public b f1941A;

    /* renamed from: z, reason: collision with root package name */
    public g f1944z;

    /* renamed from: y, reason: collision with root package name */
    public final e f1943y = new e(new O0.b(this, 2));

    /* renamed from: B, reason: collision with root package name */
    public String f1942B = "-";

    @Override // g.AbstractActivityC0133i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(t().f690a);
        g gVar = new g((AbstractActivityC0133i) this);
        this.f1944z = gVar;
        this.f1941A = gVar.z();
        g gVar2 = this.f1944z;
        if (gVar2 == null) {
            d.h("settings");
            throw null;
        }
        String string = ((SharedPreferences) gVar2.f66b).getString("passphrase_separator", "-");
        this.f1942B = string != null ? string : "-";
        b bVar = this.f1941A;
        if (bVar == null) {
            d.h("currentType");
            throw null;
        }
        c v2 = l.v(bVar);
        t().f704r.a(v2);
        t().f707u.setBackgroundColor(v2.f642a);
        t().f709w.setTextColor(v2.f643b);
        u1.d.e(t().f708v, v2);
        u1.d.d(t().f693e, v2, false);
        u1.d.d(t().d, v2, false);
        t().f710x.setText(getString(bVar.f640a));
        t().f710x.setTextColor(-1712789272);
        u1.d.f(t().f687B, v2);
        u1.d.f(t().f712z, v2);
        u1.d.f(t().f711y, v2);
        u1.d.f(t().f686A, v2);
        v(v2);
        t().f702p.setMax(24);
        SeekBar seekBar = t().f702p;
        g gVar3 = this.f1944z;
        if (gVar3 == null) {
            d.h("settings");
            throw null;
        }
        seekBar.setProgress(gVar3.y() - 8);
        g gVar4 = this.f1944z;
        if (gVar4 == null) {
            d.h("settings");
            throw null;
        }
        t().f703q.setText(getString(R.string.length_label, Integer.valueOf(gVar4.y() + 8)));
        t().f691b.setMax(24);
        SeekBar seekBar2 = t().f691b;
        g gVar5 = this.f1944z;
        if (gVar5 == null) {
            d.h("settings");
            throw null;
        }
        seekBar2.setProgress(gVar5.y() - 8);
        g gVar6 = this.f1944z;
        if (gVar6 == null) {
            d.h("settings");
            throw null;
        }
        t().f692c.setText(getString(R.string.length_label, Integer.valueOf(gVar6.y() + 8)));
        t().f700n.setMax(24);
        SeekBar seekBar3 = t().f700n;
        g gVar7 = this.f1944z;
        if (gVar7 == null) {
            d.h("settings");
            throw null;
        }
        seekBar3.setProgress(gVar7.y() - 8);
        g gVar8 = this.f1944z;
        if (gVar8 == null) {
            d.h("settings");
            throw null;
        }
        t().f701o.setText(getString(R.string.length_label, Integer.valueOf(gVar8.y() + 8)));
        t().f705s.setMax(8);
        SeekBar seekBar4 = t().f705s;
        g gVar9 = this.f1944z;
        if (gVar9 == null) {
            d.h("settings");
            throw null;
        }
        seekBar4.setProgress(l.n(((SharedPreferences) gVar9.f66b).getInt("pin_length", 6), 4, 12) - 4);
        g gVar10 = this.f1944z;
        if (gVar10 == null) {
            d.h("settings");
            throw null;
        }
        t().f706t.setText(getString(R.string.pin_length_label, Integer.valueOf(l.n(((SharedPreferences) gVar10.f66b).getInt("pin_length", 6), 4, 12) + 4)));
        t().f688C.setMax(3);
        SeekBar seekBar5 = t().f688C;
        g gVar11 = this.f1944z;
        if (gVar11 == null) {
            d.h("settings");
            throw null;
        }
        seekBar5.setProgress(l.n(((SharedPreferences) gVar11.f66b).getInt("word_count", 4), 3, 6) - 3);
        g gVar12 = this.f1944z;
        if (gVar12 == null) {
            d.h("settings");
            throw null;
        }
        t().f689D.setText(getString(R.string.word_count_label, Integer.valueOf(l.n(((SharedPreferences) gVar12.f66b).getInt("word_count", 4), 3, 6) + 3)));
        Switch r11 = t().f687B;
        g gVar13 = this.f1944z;
        if (gVar13 == null) {
            d.h("settings");
            throw null;
        }
        r11.setChecked(((SharedPreferences) gVar13.f66b).getBoolean("use_upper", true));
        Switch r112 = t().f712z;
        g gVar14 = this.f1944z;
        if (gVar14 == null) {
            d.h("settings");
            throw null;
        }
        r112.setChecked(((SharedPreferences) gVar14.f66b).getBoolean("use_lower", true));
        Switch r113 = t().f711y;
        g gVar15 = this.f1944z;
        if (gVar15 == null) {
            d.h("settings");
            throw null;
        }
        r113.setChecked(((SharedPreferences) gVar15.f66b).getBoolean("use_digits", true));
        Switch r114 = t().f686A;
        g gVar16 = this.f1944z;
        if (gVar16 == null) {
            d.h("settings");
            throw null;
        }
        r114.setChecked(((SharedPreferences) gVar16.f66b).getBoolean("use_symbols", true));
        final int i = 0;
        t().f702p.setOnSeekBarChangeListener(new h(new a1.l(this) { // from class: O0.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f631b;

            {
                this.f631b = this;
            }

            @Override // a1.l
            public final Object c(Object obj) {
                SettingsActivity settingsActivity = this.f631b;
                int i2 = i;
                int intValue = ((Integer) obj).intValue();
                switch (i2) {
                    case 0:
                        int i3 = SettingsActivity.f1940C;
                        settingsActivity.t().f703q.setText(settingsActivity.getString(R.string.length_label, Integer.valueOf(intValue + 8)));
                        break;
                    case 1:
                        int i4 = SettingsActivity.f1940C;
                        settingsActivity.t().f692c.setText(settingsActivity.getString(R.string.length_label, Integer.valueOf(intValue + 8)));
                        break;
                    case 2:
                        int i5 = SettingsActivity.f1940C;
                        settingsActivity.t().f701o.setText(settingsActivity.getString(R.string.length_label, Integer.valueOf(intValue + 8)));
                        break;
                    case 3:
                        int i6 = SettingsActivity.f1940C;
                        settingsActivity.t().f706t.setText(settingsActivity.getString(R.string.pin_length_label, Integer.valueOf(intValue + 4)));
                        break;
                    default:
                        int i7 = SettingsActivity.f1940C;
                        settingsActivity.t().f689D.setText(settingsActivity.getString(R.string.word_count_label, Integer.valueOf(intValue + 3)));
                        break;
                }
                return S0.f.f759c;
            }
        }));
        final int i2 = 1;
        t().f691b.setOnSeekBarChangeListener(new h(new a1.l(this) { // from class: O0.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f631b;

            {
                this.f631b = this;
            }

            @Override // a1.l
            public final Object c(Object obj) {
                SettingsActivity settingsActivity = this.f631b;
                int i22 = i2;
                int intValue = ((Integer) obj).intValue();
                switch (i22) {
                    case 0:
                        int i3 = SettingsActivity.f1940C;
                        settingsActivity.t().f703q.setText(settingsActivity.getString(R.string.length_label, Integer.valueOf(intValue + 8)));
                        break;
                    case 1:
                        int i4 = SettingsActivity.f1940C;
                        settingsActivity.t().f692c.setText(settingsActivity.getString(R.string.length_label, Integer.valueOf(intValue + 8)));
                        break;
                    case 2:
                        int i5 = SettingsActivity.f1940C;
                        settingsActivity.t().f701o.setText(settingsActivity.getString(R.string.length_label, Integer.valueOf(intValue + 8)));
                        break;
                    case 3:
                        int i6 = SettingsActivity.f1940C;
                        settingsActivity.t().f706t.setText(settingsActivity.getString(R.string.pin_length_label, Integer.valueOf(intValue + 4)));
                        break;
                    default:
                        int i7 = SettingsActivity.f1940C;
                        settingsActivity.t().f689D.setText(settingsActivity.getString(R.string.word_count_label, Integer.valueOf(intValue + 3)));
                        break;
                }
                return S0.f.f759c;
            }
        }));
        final int i3 = 2;
        t().f700n.setOnSeekBarChangeListener(new h(new a1.l(this) { // from class: O0.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f631b;

            {
                this.f631b = this;
            }

            @Override // a1.l
            public final Object c(Object obj) {
                SettingsActivity settingsActivity = this.f631b;
                int i22 = i3;
                int intValue = ((Integer) obj).intValue();
                switch (i22) {
                    case 0:
                        int i32 = SettingsActivity.f1940C;
                        settingsActivity.t().f703q.setText(settingsActivity.getString(R.string.length_label, Integer.valueOf(intValue + 8)));
                        break;
                    case 1:
                        int i4 = SettingsActivity.f1940C;
                        settingsActivity.t().f692c.setText(settingsActivity.getString(R.string.length_label, Integer.valueOf(intValue + 8)));
                        break;
                    case 2:
                        int i5 = SettingsActivity.f1940C;
                        settingsActivity.t().f701o.setText(settingsActivity.getString(R.string.length_label, Integer.valueOf(intValue + 8)));
                        break;
                    case 3:
                        int i6 = SettingsActivity.f1940C;
                        settingsActivity.t().f706t.setText(settingsActivity.getString(R.string.pin_length_label, Integer.valueOf(intValue + 4)));
                        break;
                    default:
                        int i7 = SettingsActivity.f1940C;
                        settingsActivity.t().f689D.setText(settingsActivity.getString(R.string.word_count_label, Integer.valueOf(intValue + 3)));
                        break;
                }
                return S0.f.f759c;
            }
        }));
        final int i4 = 3;
        t().f705s.setOnSeekBarChangeListener(new h(new a1.l(this) { // from class: O0.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f631b;

            {
                this.f631b = this;
            }

            @Override // a1.l
            public final Object c(Object obj) {
                SettingsActivity settingsActivity = this.f631b;
                int i22 = i4;
                int intValue = ((Integer) obj).intValue();
                switch (i22) {
                    case 0:
                        int i32 = SettingsActivity.f1940C;
                        settingsActivity.t().f703q.setText(settingsActivity.getString(R.string.length_label, Integer.valueOf(intValue + 8)));
                        break;
                    case 1:
                        int i42 = SettingsActivity.f1940C;
                        settingsActivity.t().f692c.setText(settingsActivity.getString(R.string.length_label, Integer.valueOf(intValue + 8)));
                        break;
                    case 2:
                        int i5 = SettingsActivity.f1940C;
                        settingsActivity.t().f701o.setText(settingsActivity.getString(R.string.length_label, Integer.valueOf(intValue + 8)));
                        break;
                    case 3:
                        int i6 = SettingsActivity.f1940C;
                        settingsActivity.t().f706t.setText(settingsActivity.getString(R.string.pin_length_label, Integer.valueOf(intValue + 4)));
                        break;
                    default:
                        int i7 = SettingsActivity.f1940C;
                        settingsActivity.t().f689D.setText(settingsActivity.getString(R.string.word_count_label, Integer.valueOf(intValue + 3)));
                        break;
                }
                return S0.f.f759c;
            }
        }));
        final int i5 = 4;
        t().f688C.setOnSeekBarChangeListener(new h(new a1.l(this) { // from class: O0.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f631b;

            {
                this.f631b = this;
            }

            @Override // a1.l
            public final Object c(Object obj) {
                SettingsActivity settingsActivity = this.f631b;
                int i22 = i5;
                int intValue = ((Integer) obj).intValue();
                switch (i22) {
                    case 0:
                        int i32 = SettingsActivity.f1940C;
                        settingsActivity.t().f703q.setText(settingsActivity.getString(R.string.length_label, Integer.valueOf(intValue + 8)));
                        break;
                    case 1:
                        int i42 = SettingsActivity.f1940C;
                        settingsActivity.t().f692c.setText(settingsActivity.getString(R.string.length_label, Integer.valueOf(intValue + 8)));
                        break;
                    case 2:
                        int i52 = SettingsActivity.f1940C;
                        settingsActivity.t().f701o.setText(settingsActivity.getString(R.string.length_label, Integer.valueOf(intValue + 8)));
                        break;
                    case 3:
                        int i6 = SettingsActivity.f1940C;
                        settingsActivity.t().f706t.setText(settingsActivity.getString(R.string.pin_length_label, Integer.valueOf(intValue + 4)));
                        break;
                    default:
                        int i7 = SettingsActivity.f1940C;
                        settingsActivity.t().f689D.setText(settingsActivity.getString(R.string.word_count_label, Integer.valueOf(intValue + 3)));
                        break;
                }
                return S0.f.f759c;
            }
        }));
        final int i6 = 3;
        t().f694f.setOnClickListener(new View.OnClickListener(this) { // from class: O0.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f629b;

            {
                this.f629b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingsActivity settingsActivity = this.f629b;
                switch (i6) {
                    case 0:
                        P0.b bVar2 = settingsActivity.f1941A;
                        if (bVar2 == null) {
                            b1.d.h("currentType");
                            throw null;
                        }
                        int ordinal = bVar2.ordinal();
                        if (ordinal == 0) {
                            boolean isChecked = settingsActivity.t().f687B.isChecked();
                            boolean isChecked2 = settingsActivity.t().f712z.isChecked();
                            boolean isChecked3 = settingsActivity.t().f711y.isChecked();
                            boolean isChecked4 = settingsActivity.t().f686A.isChecked();
                            if (!isChecked && !isChecked2 && !isChecked3 && !isChecked4) {
                                Toast.makeText(settingsActivity, R.string.need_charset, 0).show();
                                settingsActivity.t().f712z.setChecked(true);
                                return;
                            }
                            C.g gVar17 = settingsActivity.f1944z;
                            if (gVar17 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            gVar17.D(settingsActivity.t().f702p.getProgress() + 8);
                            C.g gVar18 = settingsActivity.f1944z;
                            if (gVar18 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            ((SharedPreferences) gVar18.f66b).edit().putBoolean("use_upper", isChecked).apply();
                            C.g gVar19 = settingsActivity.f1944z;
                            if (gVar19 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            ((SharedPreferences) gVar19.f66b).edit().putBoolean("use_lower", isChecked2).apply();
                            C.g gVar20 = settingsActivity.f1944z;
                            if (gVar20 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            ((SharedPreferences) gVar20.f66b).edit().putBoolean("use_digits", isChecked3).apply();
                            C.g gVar21 = settingsActivity.f1944z;
                            if (gVar21 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            ((SharedPreferences) gVar21.f66b).edit().putBoolean("use_symbols", isChecked4).apply();
                        } else if (ordinal == 1) {
                            C.g gVar22 = settingsActivity.f1944z;
                            if (gVar22 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            ((SharedPreferences) gVar22.f66b).edit().putInt("pin_length", l.n(settingsActivity.t().f705s.getProgress() + 4, 4, 12)).apply();
                        } else if (ordinal == 2) {
                            C.g gVar23 = settingsActivity.f1944z;
                            if (gVar23 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            ((SharedPreferences) gVar23.f66b).edit().putInt("word_count", l.n(settingsActivity.t().f688C.getProgress() + 3, 3, 6)).apply();
                            C.g gVar24 = settingsActivity.f1944z;
                            if (gVar24 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            String str = settingsActivity.f1942B;
                            b1.d.e(str, "value");
                            ((SharedPreferences) gVar24.f66b).edit().putString("passphrase_separator", str).apply();
                        } else if (ordinal == 3) {
                            C.g gVar25 = settingsActivity.f1944z;
                            if (gVar25 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            gVar25.D(settingsActivity.t().f691b.getProgress() + 8);
                        } else {
                            if (ordinal != 4) {
                                throw new S0.b();
                            }
                            C.g gVar26 = settingsActivity.f1944z;
                            if (gVar26 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            gVar26.D(settingsActivity.t().f700n.getProgress() + 8);
                        }
                        Toast.makeText(settingsActivity, R.string.settings_saved, 0).show();
                        settingsActivity.finish();
                        return;
                    case 1:
                        int i7 = SettingsActivity.f1940C;
                        settingsActivity.u("_");
                        return;
                    case 2:
                        int i8 = SettingsActivity.f1940C;
                        settingsActivity.finish();
                        return;
                    case 3:
                        int i9 = SettingsActivity.f1940C;
                        settingsActivity.u("-");
                        return;
                    default:
                        int i10 = SettingsActivity.f1940C;
                        settingsActivity.u(" ");
                        return;
                }
            }
        });
        final int i7 = 4;
        t().f695g.setOnClickListener(new View.OnClickListener(this) { // from class: O0.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f629b;

            {
                this.f629b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingsActivity settingsActivity = this.f629b;
                switch (i7) {
                    case 0:
                        P0.b bVar2 = settingsActivity.f1941A;
                        if (bVar2 == null) {
                            b1.d.h("currentType");
                            throw null;
                        }
                        int ordinal = bVar2.ordinal();
                        if (ordinal == 0) {
                            boolean isChecked = settingsActivity.t().f687B.isChecked();
                            boolean isChecked2 = settingsActivity.t().f712z.isChecked();
                            boolean isChecked3 = settingsActivity.t().f711y.isChecked();
                            boolean isChecked4 = settingsActivity.t().f686A.isChecked();
                            if (!isChecked && !isChecked2 && !isChecked3 && !isChecked4) {
                                Toast.makeText(settingsActivity, R.string.need_charset, 0).show();
                                settingsActivity.t().f712z.setChecked(true);
                                return;
                            }
                            C.g gVar17 = settingsActivity.f1944z;
                            if (gVar17 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            gVar17.D(settingsActivity.t().f702p.getProgress() + 8);
                            C.g gVar18 = settingsActivity.f1944z;
                            if (gVar18 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            ((SharedPreferences) gVar18.f66b).edit().putBoolean("use_upper", isChecked).apply();
                            C.g gVar19 = settingsActivity.f1944z;
                            if (gVar19 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            ((SharedPreferences) gVar19.f66b).edit().putBoolean("use_lower", isChecked2).apply();
                            C.g gVar20 = settingsActivity.f1944z;
                            if (gVar20 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            ((SharedPreferences) gVar20.f66b).edit().putBoolean("use_digits", isChecked3).apply();
                            C.g gVar21 = settingsActivity.f1944z;
                            if (gVar21 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            ((SharedPreferences) gVar21.f66b).edit().putBoolean("use_symbols", isChecked4).apply();
                        } else if (ordinal == 1) {
                            C.g gVar22 = settingsActivity.f1944z;
                            if (gVar22 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            ((SharedPreferences) gVar22.f66b).edit().putInt("pin_length", l.n(settingsActivity.t().f705s.getProgress() + 4, 4, 12)).apply();
                        } else if (ordinal == 2) {
                            C.g gVar23 = settingsActivity.f1944z;
                            if (gVar23 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            ((SharedPreferences) gVar23.f66b).edit().putInt("word_count", l.n(settingsActivity.t().f688C.getProgress() + 3, 3, 6)).apply();
                            C.g gVar24 = settingsActivity.f1944z;
                            if (gVar24 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            String str = settingsActivity.f1942B;
                            b1.d.e(str, "value");
                            ((SharedPreferences) gVar24.f66b).edit().putString("passphrase_separator", str).apply();
                        } else if (ordinal == 3) {
                            C.g gVar25 = settingsActivity.f1944z;
                            if (gVar25 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            gVar25.D(settingsActivity.t().f691b.getProgress() + 8);
                        } else {
                            if (ordinal != 4) {
                                throw new S0.b();
                            }
                            C.g gVar26 = settingsActivity.f1944z;
                            if (gVar26 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            gVar26.D(settingsActivity.t().f700n.getProgress() + 8);
                        }
                        Toast.makeText(settingsActivity, R.string.settings_saved, 0).show();
                        settingsActivity.finish();
                        return;
                    case 1:
                        int i72 = SettingsActivity.f1940C;
                        settingsActivity.u("_");
                        return;
                    case 2:
                        int i8 = SettingsActivity.f1940C;
                        settingsActivity.finish();
                        return;
                    case 3:
                        int i9 = SettingsActivity.f1940C;
                        settingsActivity.u("-");
                        return;
                    default:
                        int i10 = SettingsActivity.f1940C;
                        settingsActivity.u(" ");
                        return;
                }
            }
        });
        final int i8 = 1;
        t().h.setOnClickListener(new View.OnClickListener(this) { // from class: O0.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f629b;

            {
                this.f629b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingsActivity settingsActivity = this.f629b;
                switch (i8) {
                    case 0:
                        P0.b bVar2 = settingsActivity.f1941A;
                        if (bVar2 == null) {
                            b1.d.h("currentType");
                            throw null;
                        }
                        int ordinal = bVar2.ordinal();
                        if (ordinal == 0) {
                            boolean isChecked = settingsActivity.t().f687B.isChecked();
                            boolean isChecked2 = settingsActivity.t().f712z.isChecked();
                            boolean isChecked3 = settingsActivity.t().f711y.isChecked();
                            boolean isChecked4 = settingsActivity.t().f686A.isChecked();
                            if (!isChecked && !isChecked2 && !isChecked3 && !isChecked4) {
                                Toast.makeText(settingsActivity, R.string.need_charset, 0).show();
                                settingsActivity.t().f712z.setChecked(true);
                                return;
                            }
                            C.g gVar17 = settingsActivity.f1944z;
                            if (gVar17 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            gVar17.D(settingsActivity.t().f702p.getProgress() + 8);
                            C.g gVar18 = settingsActivity.f1944z;
                            if (gVar18 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            ((SharedPreferences) gVar18.f66b).edit().putBoolean("use_upper", isChecked).apply();
                            C.g gVar19 = settingsActivity.f1944z;
                            if (gVar19 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            ((SharedPreferences) gVar19.f66b).edit().putBoolean("use_lower", isChecked2).apply();
                            C.g gVar20 = settingsActivity.f1944z;
                            if (gVar20 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            ((SharedPreferences) gVar20.f66b).edit().putBoolean("use_digits", isChecked3).apply();
                            C.g gVar21 = settingsActivity.f1944z;
                            if (gVar21 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            ((SharedPreferences) gVar21.f66b).edit().putBoolean("use_symbols", isChecked4).apply();
                        } else if (ordinal == 1) {
                            C.g gVar22 = settingsActivity.f1944z;
                            if (gVar22 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            ((SharedPreferences) gVar22.f66b).edit().putInt("pin_length", l.n(settingsActivity.t().f705s.getProgress() + 4, 4, 12)).apply();
                        } else if (ordinal == 2) {
                            C.g gVar23 = settingsActivity.f1944z;
                            if (gVar23 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            ((SharedPreferences) gVar23.f66b).edit().putInt("word_count", l.n(settingsActivity.t().f688C.getProgress() + 3, 3, 6)).apply();
                            C.g gVar24 = settingsActivity.f1944z;
                            if (gVar24 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            String str = settingsActivity.f1942B;
                            b1.d.e(str, "value");
                            ((SharedPreferences) gVar24.f66b).edit().putString("passphrase_separator", str).apply();
                        } else if (ordinal == 3) {
                            C.g gVar25 = settingsActivity.f1944z;
                            if (gVar25 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            gVar25.D(settingsActivity.t().f691b.getProgress() + 8);
                        } else {
                            if (ordinal != 4) {
                                throw new S0.b();
                            }
                            C.g gVar26 = settingsActivity.f1944z;
                            if (gVar26 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            gVar26.D(settingsActivity.t().f700n.getProgress() + 8);
                        }
                        Toast.makeText(settingsActivity, R.string.settings_saved, 0).show();
                        settingsActivity.finish();
                        return;
                    case 1:
                        int i72 = SettingsActivity.f1940C;
                        settingsActivity.u("_");
                        return;
                    case 2:
                        int i82 = SettingsActivity.f1940C;
                        settingsActivity.finish();
                        return;
                    case 3:
                        int i9 = SettingsActivity.f1940C;
                        settingsActivity.u("-");
                        return;
                    default:
                        int i10 = SettingsActivity.f1940C;
                        settingsActivity.u(" ");
                        return;
                }
            }
        });
        b bVar2 = this.f1941A;
        if (bVar2 == null) {
            d.h("currentType");
            throw null;
        }
        t().f699m.setVisibility(bVar2 == b.SECURE ? 0 : 8);
        t().f698l.setVisibility(bVar2 == b.PIN ? 0 : 8);
        t().f697k.setVisibility(bVar2 == b.PASSPHRASE ? 0 : 8);
        t().i.setVisibility(bVar2 == b.ALPHANUMERIC ? 0 : 8);
        t().f696j.setVisibility(bVar2 != b.HEX ? 8 : 0);
        final int i9 = 0;
        t().f693e.setOnClickListener(new View.OnClickListener(this) { // from class: O0.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f629b;

            {
                this.f629b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingsActivity settingsActivity = this.f629b;
                switch (i9) {
                    case 0:
                        P0.b bVar22 = settingsActivity.f1941A;
                        if (bVar22 == null) {
                            b1.d.h("currentType");
                            throw null;
                        }
                        int ordinal = bVar22.ordinal();
                        if (ordinal == 0) {
                            boolean isChecked = settingsActivity.t().f687B.isChecked();
                            boolean isChecked2 = settingsActivity.t().f712z.isChecked();
                            boolean isChecked3 = settingsActivity.t().f711y.isChecked();
                            boolean isChecked4 = settingsActivity.t().f686A.isChecked();
                            if (!isChecked && !isChecked2 && !isChecked3 && !isChecked4) {
                                Toast.makeText(settingsActivity, R.string.need_charset, 0).show();
                                settingsActivity.t().f712z.setChecked(true);
                                return;
                            }
                            C.g gVar17 = settingsActivity.f1944z;
                            if (gVar17 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            gVar17.D(settingsActivity.t().f702p.getProgress() + 8);
                            C.g gVar18 = settingsActivity.f1944z;
                            if (gVar18 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            ((SharedPreferences) gVar18.f66b).edit().putBoolean("use_upper", isChecked).apply();
                            C.g gVar19 = settingsActivity.f1944z;
                            if (gVar19 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            ((SharedPreferences) gVar19.f66b).edit().putBoolean("use_lower", isChecked2).apply();
                            C.g gVar20 = settingsActivity.f1944z;
                            if (gVar20 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            ((SharedPreferences) gVar20.f66b).edit().putBoolean("use_digits", isChecked3).apply();
                            C.g gVar21 = settingsActivity.f1944z;
                            if (gVar21 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            ((SharedPreferences) gVar21.f66b).edit().putBoolean("use_symbols", isChecked4).apply();
                        } else if (ordinal == 1) {
                            C.g gVar22 = settingsActivity.f1944z;
                            if (gVar22 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            ((SharedPreferences) gVar22.f66b).edit().putInt("pin_length", l.n(settingsActivity.t().f705s.getProgress() + 4, 4, 12)).apply();
                        } else if (ordinal == 2) {
                            C.g gVar23 = settingsActivity.f1944z;
                            if (gVar23 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            ((SharedPreferences) gVar23.f66b).edit().putInt("word_count", l.n(settingsActivity.t().f688C.getProgress() + 3, 3, 6)).apply();
                            C.g gVar24 = settingsActivity.f1944z;
                            if (gVar24 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            String str = settingsActivity.f1942B;
                            b1.d.e(str, "value");
                            ((SharedPreferences) gVar24.f66b).edit().putString("passphrase_separator", str).apply();
                        } else if (ordinal == 3) {
                            C.g gVar25 = settingsActivity.f1944z;
                            if (gVar25 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            gVar25.D(settingsActivity.t().f691b.getProgress() + 8);
                        } else {
                            if (ordinal != 4) {
                                throw new S0.b();
                            }
                            C.g gVar26 = settingsActivity.f1944z;
                            if (gVar26 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            gVar26.D(settingsActivity.t().f700n.getProgress() + 8);
                        }
                        Toast.makeText(settingsActivity, R.string.settings_saved, 0).show();
                        settingsActivity.finish();
                        return;
                    case 1:
                        int i72 = SettingsActivity.f1940C;
                        settingsActivity.u("_");
                        return;
                    case 2:
                        int i82 = SettingsActivity.f1940C;
                        settingsActivity.finish();
                        return;
                    case 3:
                        int i92 = SettingsActivity.f1940C;
                        settingsActivity.u("-");
                        return;
                    default:
                        int i10 = SettingsActivity.f1940C;
                        settingsActivity.u(" ");
                        return;
                }
            }
        });
        final int i10 = 2;
        t().d.setOnClickListener(new View.OnClickListener(this) { // from class: O0.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f629b;

            {
                this.f629b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingsActivity settingsActivity = this.f629b;
                switch (i10) {
                    case 0:
                        P0.b bVar22 = settingsActivity.f1941A;
                        if (bVar22 == null) {
                            b1.d.h("currentType");
                            throw null;
                        }
                        int ordinal = bVar22.ordinal();
                        if (ordinal == 0) {
                            boolean isChecked = settingsActivity.t().f687B.isChecked();
                            boolean isChecked2 = settingsActivity.t().f712z.isChecked();
                            boolean isChecked3 = settingsActivity.t().f711y.isChecked();
                            boolean isChecked4 = settingsActivity.t().f686A.isChecked();
                            if (!isChecked && !isChecked2 && !isChecked3 && !isChecked4) {
                                Toast.makeText(settingsActivity, R.string.need_charset, 0).show();
                                settingsActivity.t().f712z.setChecked(true);
                                return;
                            }
                            C.g gVar17 = settingsActivity.f1944z;
                            if (gVar17 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            gVar17.D(settingsActivity.t().f702p.getProgress() + 8);
                            C.g gVar18 = settingsActivity.f1944z;
                            if (gVar18 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            ((SharedPreferences) gVar18.f66b).edit().putBoolean("use_upper", isChecked).apply();
                            C.g gVar19 = settingsActivity.f1944z;
                            if (gVar19 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            ((SharedPreferences) gVar19.f66b).edit().putBoolean("use_lower", isChecked2).apply();
                            C.g gVar20 = settingsActivity.f1944z;
                            if (gVar20 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            ((SharedPreferences) gVar20.f66b).edit().putBoolean("use_digits", isChecked3).apply();
                            C.g gVar21 = settingsActivity.f1944z;
                            if (gVar21 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            ((SharedPreferences) gVar21.f66b).edit().putBoolean("use_symbols", isChecked4).apply();
                        } else if (ordinal == 1) {
                            C.g gVar22 = settingsActivity.f1944z;
                            if (gVar22 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            ((SharedPreferences) gVar22.f66b).edit().putInt("pin_length", l.n(settingsActivity.t().f705s.getProgress() + 4, 4, 12)).apply();
                        } else if (ordinal == 2) {
                            C.g gVar23 = settingsActivity.f1944z;
                            if (gVar23 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            ((SharedPreferences) gVar23.f66b).edit().putInt("word_count", l.n(settingsActivity.t().f688C.getProgress() + 3, 3, 6)).apply();
                            C.g gVar24 = settingsActivity.f1944z;
                            if (gVar24 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            String str = settingsActivity.f1942B;
                            b1.d.e(str, "value");
                            ((SharedPreferences) gVar24.f66b).edit().putString("passphrase_separator", str).apply();
                        } else if (ordinal == 3) {
                            C.g gVar25 = settingsActivity.f1944z;
                            if (gVar25 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            gVar25.D(settingsActivity.t().f691b.getProgress() + 8);
                        } else {
                            if (ordinal != 4) {
                                throw new S0.b();
                            }
                            C.g gVar26 = settingsActivity.f1944z;
                            if (gVar26 == null) {
                                b1.d.h("settings");
                                throw null;
                            }
                            gVar26.D(settingsActivity.t().f700n.getProgress() + 8);
                        }
                        Toast.makeText(settingsActivity, R.string.settings_saved, 0).show();
                        settingsActivity.finish();
                        return;
                    case 1:
                        int i72 = SettingsActivity.f1940C;
                        settingsActivity.u("_");
                        return;
                    case 2:
                        int i82 = SettingsActivity.f1940C;
                        settingsActivity.finish();
                        return;
                    case 3:
                        int i92 = SettingsActivity.f1940C;
                        settingsActivity.u("-");
                        return;
                    default:
                        int i102 = SettingsActivity.f1940C;
                        settingsActivity.u(" ");
                        return;
                }
            }
        });
    }

    public final Q0.c t() {
        return (Q0.c) this.f1943y.a();
    }

    public final void u(String str) {
        this.f1942B = str;
        b bVar = this.f1941A;
        if (bVar != null) {
            v(l.v(bVar));
        } else {
            d.h("currentType");
            throw null;
        }
    }

    public final void v(c cVar) {
        u1.d.d(t().f694f, cVar, d.a(this.f1942B, "-"));
        u1.d.d(t().f695g, cVar, d.a(this.f1942B, " "));
        u1.d.d(t().h, cVar, d.a(this.f1942B, "_"));
    }
}
