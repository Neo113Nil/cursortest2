package com.oriondriftchasers.arordrft;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.card.MaterialCardView;
import g.j;
import h.a;
import java.util.Iterator;
import l.t;
import org.json.JSONArray;
import org.json.JSONObject;
import t0.d;
import y2.f;
import y2.g;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class QuizActivityGame extends j {
    public static final /* synthetic */ int I = 0;
    public t E;
    public f F;
    public int G;
    public int H;

    @Override // g.j, a.m, c0.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object obj;
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_quiz_game, (ViewGroup) null, false);
        int i = R.id.answer_options_radio_group;
        RadioGroup radioGroup = (RadioGroup) a.s(inflate, R.id.answer_options_radio_group);
        if (radioGroup != null) {
            i = R.id.answers_card_container;
            if (((MaterialCardView) a.s(inflate, R.id.answers_card_container)) != null) {
                i = R.id.feedback_message_text;
                TextView textView = (TextView) a.s(inflate, R.id.feedback_message_text);
                if (textView != null) {
                    i = R.id.question_card_container;
                    if (((MaterialCardView) a.s(inflate, R.id.question_card_container)) != null) {
                        i = R.id.question_progress_text;
                        TextView textView2 = (TextView) a.s(inflate, R.id.question_progress_text);
                        if (textView2 != null) {
                            i = R.id.question_text_display;
                            TextView textView3 = (TextView) a.s(inflate, R.id.question_text_display);
                            if (textView3 != null) {
                                i = R.id.quiz_title_header_text;
                                TextView textView4 = (TextView) a.s(inflate, R.id.quiz_title_header_text);
                                if (textView4 != null) {
                                    i = R.id.submit_answer_button;
                                    Button button = (Button) a.s(inflate, R.id.submit_answer_button);
                                    if (button != null) {
                                        ScrollView scrollView = (ScrollView) inflate;
                                        this.E = new t(scrollView, radioGroup, textView, textView2, textView3, textView4, button);
                                        setContentView(scrollView);
                                        String stringExtra = getIntent().getStringExtra("quiz_id");
                                        if (stringExtra == null) {
                                            stringExtra = "";
                                        }
                                        Iterator it = d.f().iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                obj = null;
                                                break;
                                            } else {
                                                obj = it.next();
                                                if (((f) obj).f3826a.equals(stringExtra)) {
                                                    break;
                                                }
                                            }
                                        }
                                        f fVar = (f) obj;
                                        if (fVar == null) {
                                            fVar = (f) d.f().get(0);
                                        }
                                        this.F = fVar;
                                        t tVar = this.E;
                                        if (tVar == null) {
                                            f3.d.g("bindingQuiz");
                                            throw null;
                                        }
                                        TextView textView5 = (TextView) tVar.f2457e;
                                        if (fVar == null) {
                                            f3.d.g("currentQuizData");
                                            throw null;
                                        }
                                        textView5.setText(fVar.f3828c + " " + fVar.f3827b);
                                        s();
                                        t tVar2 = this.E;
                                        if (tVar2 != null) {
                                            ((Button) tVar2.f2458f).setOnClickListener(new r2.a(this, 0));
                                            return;
                                        } else {
                                            f3.d.g("bindingQuiz");
                                            throw null;
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

    public final void r() {
        t tVar = this.E;
        if (tVar == null) {
            f3.d.g("bindingQuiz");
            throw null;
        }
        int checkedRadioButtonId = ((RadioGroup) tVar.f2454a).getCheckedRadioButtonId();
        if (checkedRadioButtonId == -1) {
            Toast.makeText(this, "⚠️ Please select an answer", 0).show();
            return;
        }
        t tVar2 = this.E;
        if (tVar2 == null) {
            f3.d.g("bindingQuiz");
            throw null;
        }
        int indexOfChild = ((RadioGroup) tVar2.f2454a).indexOfChild(findViewById(checkedRadioButtonId));
        f fVar = this.F;
        if (fVar == null) {
            f3.d.g("currentQuizData");
            throw null;
        }
        g gVar = (g) fVar.d.get(this.G);
        int i = gVar.f3831c;
        if (indexOfChild == i) {
            this.H++;
            t tVar3 = this.E;
            if (tVar3 == null) {
                f3.d.g("bindingQuiz");
                throw null;
            }
            ((TextView) tVar3.f2455b).setText("✅ Correct!");
            t tVar4 = this.E;
            if (tVar4 == null) {
                f3.d.g("bindingQuiz");
                throw null;
            }
            ((TextView) tVar4.f2455b).setTextColor(getColor(R.color.success_green));
        } else {
            t tVar5 = this.E;
            if (tVar5 == null) {
                f3.d.g("bindingQuiz");
                throw null;
            }
            ((TextView) tVar5.f2455b).setText("❌ Incorrect! The answer was: " + gVar.f3830b.get(i));
            t tVar6 = this.E;
            if (tVar6 == null) {
                f3.d.g("bindingQuiz");
                throw null;
            }
            ((TextView) tVar6.f2455b).setTextColor(getColor(R.color.warning_orange));
        }
        t tVar7 = this.E;
        if (tVar7 == null) {
            f3.d.g("bindingQuiz");
            throw null;
        }
        ((TextView) tVar7.f2455b).setVisibility(0);
        t tVar8 = this.E;
        if (tVar8 == null) {
            f3.d.g("bindingQuiz");
            throw null;
        }
        ((RadioGroup) tVar8.f2454a).setEnabled(false);
        t tVar9 = this.E;
        if (tVar9 == null) {
            f3.d.g("bindingQuiz");
            throw null;
        }
        int childCount = ((RadioGroup) tVar9.f2454a).getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            t tVar10 = this.E;
            if (tVar10 == null) {
                f3.d.g("bindingQuiz");
                throw null;
            }
            ((RadioGroup) tVar10.f2454a).getChildAt(i4).setEnabled(false);
        }
        int i5 = this.G + 1;
        this.G = i5;
        f fVar2 = this.F;
        if (fVar2 == null) {
            f3.d.g("currentQuizData");
            throw null;
        }
        if (i5 < fVar2.d.size()) {
            t tVar11 = this.E;
            if (tVar11 == null) {
                f3.d.g("bindingQuiz");
                throw null;
            }
            ((Button) tVar11.f2458f).setText(getString(R.string.next_question));
            t tVar12 = this.E;
            if (tVar12 != null) {
                ((Button) tVar12.f2458f).setOnClickListener(new r2.a(this, 1));
                return;
            } else {
                f3.d.g("bindingQuiz");
                throw null;
            }
        }
        SharedPreferences sharedPreferences = getSharedPreferences("quiz_storage_prefs", 0);
        f fVar3 = this.F;
        if (fVar3 == null) {
            f3.d.g("currentQuizData");
            throw null;
        }
        String str = fVar3.f3826a;
        int size = fVar3.d.size();
        int i6 = this.H;
        long currentTimeMillis = System.currentTimeMillis();
        String string = sharedPreferences.getString("quiz_results", "[]");
        JSONArray jSONArray = new JSONArray(string != null ? string : "[]");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("quizId", str);
        jSONObject.put("totalQuestions", size);
        jSONObject.put("correctAnswers", i6);
        jSONObject.put("timestamp", currentTimeMillis);
        jSONArray.put(jSONObject);
        sharedPreferences.edit().putString("quiz_results", jSONArray.toString()).apply();
        t tVar13 = this.E;
        if (tVar13 == null) {
            f3.d.g("bindingQuiz");
            throw null;
        }
        ((Button) tVar13.f2458f).setText(getString(R.string.finish_quiz));
        t tVar14 = this.E;
        if (tVar14 == null) {
            f3.d.g("bindingQuiz");
            throw null;
        }
        ((Button) tVar14.f2458f).setOnClickListener(new r2.a(this, 3));
    }

    public final void s() {
        f fVar = this.F;
        if (fVar == null) {
            f3.d.g("currentQuizData");
            throw null;
        }
        g gVar = (g) fVar.d.get(this.G);
        t tVar = this.E;
        if (tVar == null) {
            f3.d.g("bindingQuiz");
            throw null;
        }
        TextView textView = (TextView) tVar.f2456c;
        int i = this.G + 1;
        f fVar2 = this.F;
        if (fVar2 == null) {
            f3.d.g("currentQuizData");
            throw null;
        }
        textView.setText("Question " + i + "/" + fVar2.d.size());
        t tVar2 = this.E;
        if (tVar2 == null) {
            f3.d.g("bindingQuiz");
            throw null;
        }
        ((TextView) tVar2.d).setText(gVar.f3829a);
        t tVar3 = this.E;
        if (tVar3 == null) {
            f3.d.g("bindingQuiz");
            throw null;
        }
        ((RadioGroup) tVar3.f2454a).removeAllViews();
        int i4 = 0;
        for (Object obj : gVar.f3830b) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            RadioButton radioButton = new RadioButton(this);
            radioButton.setId(View.generateViewId());
            radioButton.setText((String) obj);
            radioButton.setTextSize(16.0f);
            radioButton.setTextColor(getColor(R.color.star_white));
            radioButton.setPadding(16, 16, 16, 16);
            t tVar4 = this.E;
            if (tVar4 == null) {
                f3.d.g("bindingQuiz");
                throw null;
            }
            ((RadioGroup) tVar4.f2454a).addView(radioButton);
            i4 = i5;
        }
        t tVar5 = this.E;
        if (tVar5 == null) {
            f3.d.g("bindingQuiz");
            throw null;
        }
        ((TextView) tVar5.f2455b).setVisibility(8);
        t tVar6 = this.E;
        if (tVar6 == null) {
            f3.d.g("bindingQuiz");
            throw null;
        }
        ((Button) tVar6.f2458f).setText(getString(R.string.submit_answer));
    }
}
