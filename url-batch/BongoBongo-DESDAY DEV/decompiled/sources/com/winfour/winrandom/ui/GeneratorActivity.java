package com.winfour.winrandom.ui;

import A.a;
import A1.m;
import R0.c;
import T0.b;
import V0.d;
import W0.g;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textfield.TextInputEditText;
import com.winfour.winrandom.R;
import com.winfour.winrandom.ui.GeneratorActivity;
import com.winfour.winrandom.ui.RandomDisplayView;
import g.AbstractActivityC0106i;
import g1.InterfaceC0110a;
import h.AbstractC0112a;
import java.util.ArrayList;
import java.util.List;
import o1.k;

/* loaded from: classes.dex */
public final class GeneratorActivity extends AbstractActivityC0106i {

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f2105B = 0;

    /* renamed from: A, reason: collision with root package name */
    public String f2106A = "";

    /* renamed from: y, reason: collision with root package name */
    public final d f2107y;

    /* renamed from: z, reason: collision with root package name */
    public final d f2108z;

    public GeneratorActivity() {
        final int i = 0;
        this.f2107y = new d(new InterfaceC0110a(this) { // from class: U0.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GeneratorActivity f874b;

            {
                this.f874b = this;
            }

            @Override // g1.InterfaceC0110a
            public final Object b() {
                GeneratorActivity generatorActivity = this.f874b;
                switch (i) {
                    case 0:
                        int i2 = GeneratorActivity.f2105B;
                        View inflate = generatorActivity.getLayoutInflater().inflate(R.layout.activity_generator, (ViewGroup) null, false);
                        int i3 = R.id.btnBack;
                        MaterialButton materialButton = (MaterialButton) AbstractC0112a.h(inflate, R.id.btnBack);
                        if (materialButton != null) {
                            i3 = R.id.btnCopy;
                            MaterialButton materialButton2 = (MaterialButton) AbstractC0112a.h(inflate, R.id.btnCopy);
                            if (materialButton2 != null) {
                                i3 = R.id.btnGenerate;
                                MaterialButton materialButton3 = (MaterialButton) AbstractC0112a.h(inflate, R.id.btnGenerate);
                                if (materialButton3 != null) {
                                    i3 = R.id.inputCount;
                                    TextInputEditText textInputEditText = (TextInputEditText) AbstractC0112a.h(inflate, R.id.inputCount);
                                    if (textInputEditText != null) {
                                        i3 = R.id.inputMax;
                                        TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC0112a.h(inflate, R.id.inputMax);
                                        if (textInputEditText2 != null) {
                                            i3 = R.id.inputMin;
                                            TextInputEditText textInputEditText3 = (TextInputEditText) AbstractC0112a.h(inflate, R.id.inputMin);
                                            if (textInputEditText3 != null) {
                                                i3 = R.id.randomDisplay;
                                                RandomDisplayView randomDisplayView = (RandomDisplayView) AbstractC0112a.h(inflate, R.id.randomDisplay);
                                                if (randomDisplayView != null) {
                                                    i3 = R.id.switchUnique;
                                                    SwitchMaterial switchMaterial = (SwitchMaterial) AbstractC0112a.h(inflate, R.id.switchUnique);
                                                    if (switchMaterial != null) {
                                                        return new S0.a((LinearLayout) inflate, materialButton, materialButton2, materialButton3, textInputEditText, textInputEditText2, textInputEditText3, randomDisplayView, switchMaterial);
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
                        int i4 = GeneratorActivity.f2105B;
                        return new R0.c(generatorActivity);
                }
            }
        });
        final int i2 = 1;
        this.f2108z = new d(new InterfaceC0110a(this) { // from class: U0.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GeneratorActivity f874b;

            {
                this.f874b = this;
            }

            @Override // g1.InterfaceC0110a
            public final Object b() {
                GeneratorActivity generatorActivity = this.f874b;
                switch (i2) {
                    case 0:
                        int i22 = GeneratorActivity.f2105B;
                        View inflate = generatorActivity.getLayoutInflater().inflate(R.layout.activity_generator, (ViewGroup) null, false);
                        int i3 = R.id.btnBack;
                        MaterialButton materialButton = (MaterialButton) AbstractC0112a.h(inflate, R.id.btnBack);
                        if (materialButton != null) {
                            i3 = R.id.btnCopy;
                            MaterialButton materialButton2 = (MaterialButton) AbstractC0112a.h(inflate, R.id.btnCopy);
                            if (materialButton2 != null) {
                                i3 = R.id.btnGenerate;
                                MaterialButton materialButton3 = (MaterialButton) AbstractC0112a.h(inflate, R.id.btnGenerate);
                                if (materialButton3 != null) {
                                    i3 = R.id.inputCount;
                                    TextInputEditText textInputEditText = (TextInputEditText) AbstractC0112a.h(inflate, R.id.inputCount);
                                    if (textInputEditText != null) {
                                        i3 = R.id.inputMax;
                                        TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC0112a.h(inflate, R.id.inputMax);
                                        if (textInputEditText2 != null) {
                                            i3 = R.id.inputMin;
                                            TextInputEditText textInputEditText3 = (TextInputEditText) AbstractC0112a.h(inflate, R.id.inputMin);
                                            if (textInputEditText3 != null) {
                                                i3 = R.id.randomDisplay;
                                                RandomDisplayView randomDisplayView = (RandomDisplayView) AbstractC0112a.h(inflate, R.id.randomDisplay);
                                                if (randomDisplayView != null) {
                                                    i3 = R.id.switchUnique;
                                                    SwitchMaterial switchMaterial = (SwitchMaterial) AbstractC0112a.h(inflate, R.id.switchUnique);
                                                    if (switchMaterial != null) {
                                                        return new S0.a((LinearLayout) inflate, materialButton, materialButton2, materialButton3, textInputEditText, textInputEditText2, textInputEditText3, randomDisplayView, switchMaterial);
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
                        int i4 = GeneratorActivity.f2105B;
                        return new R0.c(generatorActivity);
                }
            }
        });
    }

    @Override // g.AbstractActivityC0106i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(u().f800a);
        b bVar = !getIntent().hasExtra("extra_min") ? null : new b(getIntent().getIntExtra("extra_min", 1), getIntent().getIntExtra("extra_max", 100), getIntent().getIntExtra("extra_count", 1), getIntent().getBooleanExtra("extra_unique", false));
        if (bVar == null) {
            SharedPreferences sharedPreferences = ((c) this.f2108z.a()).f798a;
            bVar = new b(sharedPreferences.getInt("default_min", 1), sharedPreferences.getInt("default_max", 100), sharedPreferences.getInt("default_count", 1), sharedPreferences.getBoolean("default_unique", false));
        }
        u().f805g.setText(String.valueOf(bVar.f833a));
        u().f804f.setText(String.valueOf(bVar.f834b));
        u().f803e.setText(String.valueOf(bVar.f835c));
        u().i.setChecked(bVar.d);
        if (getIntent().getBooleanExtra("extra_auto_generate", false)) {
            u().f800a.post(new a(7, this));
        }
        final int i = 0;
        u().f801b.setOnClickListener(new View.OnClickListener(this) { // from class: U0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GeneratorActivity f872b;

            {
                this.f872b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GeneratorActivity generatorActivity = this.f872b;
                switch (i) {
                    case 0:
                        int i2 = GeneratorActivity.f2105B;
                        generatorActivity.finish();
                        break;
                    case 1:
                        if (!o1.d.G(generatorActivity.f2106A)) {
                            Object systemService = generatorActivity.getSystemService("clipboard");
                            h1.d.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("win_random", generatorActivity.f2106A));
                            Toast.makeText(generatorActivity, R.string.copied, 0).show();
                            break;
                        }
                        break;
                    default:
                        int i3 = GeneratorActivity.f2105B;
                        generatorActivity.t();
                        break;
                }
            }
        });
        final int i2 = 1;
        u().f802c.setOnClickListener(new View.OnClickListener(this) { // from class: U0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GeneratorActivity f872b;

            {
                this.f872b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GeneratorActivity generatorActivity = this.f872b;
                switch (i2) {
                    case 0:
                        int i22 = GeneratorActivity.f2105B;
                        generatorActivity.finish();
                        break;
                    case 1:
                        if (!o1.d.G(generatorActivity.f2106A)) {
                            Object systemService = generatorActivity.getSystemService("clipboard");
                            h1.d.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("win_random", generatorActivity.f2106A));
                            Toast.makeText(generatorActivity, R.string.copied, 0).show();
                            break;
                        }
                        break;
                    default:
                        int i3 = GeneratorActivity.f2105B;
                        generatorActivity.t();
                        break;
                }
            }
        });
        final int i3 = 2;
        u().d.setOnClickListener(new View.OnClickListener(this) { // from class: U0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GeneratorActivity f872b;

            {
                this.f872b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GeneratorActivity generatorActivity = this.f872b;
                switch (i3) {
                    case 0:
                        int i22 = GeneratorActivity.f2105B;
                        generatorActivity.finish();
                        break;
                    case 1:
                        if (!o1.d.G(generatorActivity.f2106A)) {
                            Object systemService = generatorActivity.getSystemService("clipboard");
                            h1.d.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("win_random", generatorActivity.f2106A));
                            Toast.makeText(generatorActivity, R.string.copied, 0).show();
                            break;
                        }
                        break;
                    default:
                        int i32 = GeneratorActivity.f2105B;
                        generatorActivity.t();
                        break;
                }
            }
        });
        RandomDisplayView randomDisplayView = u().f806h;
        randomDisplayView.f2122f = "";
        randomDisplayView.f2124h = 1.0f;
        randomDisplayView.i = false;
        randomDisplayView.invalidate();
    }

    public final void t() {
        String obj;
        String obj2;
        String obj3;
        Editable text = u().f805g.getText();
        b bVar = null;
        Integer t2 = (text == null || (obj3 = text.toString()) == null) ? null : k.t(obj3);
        Editable text2 = u().f804f.getText();
        Integer t3 = (text2 == null || (obj2 = text2.toString()) == null) ? null : k.t(obj2);
        Editable text3 = u().f803e.getText();
        Integer t4 = (text3 == null || (obj = text3.toString()) == null) ? null : k.t(obj);
        if (t2 == null || t3 == null || t4 == null || t4.intValue() < 1) {
            Toast.makeText(this, R.string.error_invalid_input, 0).show();
        } else {
            int intValue = t2.intValue();
            int intValue2 = t3.intValue();
            int intValue3 = t4.intValue();
            boolean isChecked = u().i.isChecked();
            int i = intValue > intValue2 ? intValue2 : intValue;
            if (intValue2 >= intValue) {
                intValue = intValue2;
            }
            if (intValue3 < 1) {
                intValue3 = 1;
            }
            bVar = new b(i, intValue, intValue3, isChecked);
        }
        if (bVar == null) {
            return;
        }
        try {
            List r2 = m.r(bVar);
            this.f2106A = r2.size() == 1 ? String.valueOf(((Number) g.q0(r2)).intValue()) : g.s0(r2, ", ", null, null, null, 62);
            RandomDisplayView randomDisplayView = u().f806h;
            int i2 = RandomDisplayView.f2117k;
            randomDisplayView.f2122f = r2.isEmpty() ? "" : r2.size() == 1 ? String.valueOf(((Number) g.q0(r2)).intValue()) : g.s0(r2, "\n", null, null, null, 62);
            randomDisplayView.f2124h = RecyclerView.A0;
            randomDisplayView.i = true;
            Choreographer.getInstance().postFrameCallback(randomDisplayView.f2125j);
            d dVar = this.f2108z;
            c cVar = (c) dVar.a();
            cVar.getClass();
            b a2 = bVar.a();
            SharedPreferences sharedPreferences = cVar.f798a;
            h1.d.d(sharedPreferences, "prefs");
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt("default_min", a2.f833a);
            edit.putInt("default_max", a2.f834b);
            edit.putInt("default_count", a2.f835c);
            edit.putBoolean("default_unique", a2.d);
            edit.apply();
            c cVar2 = (c) dVar.a();
            String str = this.f2106A;
            cVar2.getClass();
            h1.d.e(str, "result");
            b a3 = bVar.a();
            R0.a aVar = new R0.a(System.currentTimeMillis(), a3.a().f833a + "вЂ“" + a3.a().f834b, a3.f835c, a3.d, str);
            ArrayList arrayList = new ArrayList(cVar2.a());
            arrayList.add(0, aVar);
            if (arrayList.size() > 50) {
                arrayList.subList(50, arrayList.size()).clear();
            }
            String s02 = g.s0(arrayList, "||", null, null, new R0.b(), 30);
            SharedPreferences sharedPreferences2 = cVar2.f798a;
            h1.d.d(sharedPreferences2, "prefs");
            SharedPreferences.Editor edit2 = sharedPreferences2.edit();
            edit2.putString("history", s02);
            edit2.apply();
        } catch (IllegalArgumentException unused) {
            Toast.makeText(this, R.string.error_unique_range, 0).show();
        }
    }

    public final S0.a u() {
        return (S0.a) this.f2107y.a();
    }
}
