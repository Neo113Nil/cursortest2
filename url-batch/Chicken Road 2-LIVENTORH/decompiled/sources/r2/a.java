package r2;

import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import com.oriondriftchasers.arordrft.QuizActivityGame;
import f3.d;
import l.t;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3153f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ QuizActivityGame f3154g;

    public /* synthetic */ a(QuizActivityGame quizActivityGame, int i) {
        this.f3153f = i;
        this.f3154g = quizActivityGame;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f3153f;
        QuizActivityGame quizActivityGame = this.f3154g;
        switch (i) {
            case 0:
                int i4 = QuizActivityGame.I;
                quizActivityGame.r();
                return;
            case 1:
                t tVar = quizActivityGame.E;
                if (tVar == null) {
                    d.g("bindingQuiz");
                    throw null;
                }
                ((RadioGroup) tVar.f2454a).setEnabled(true);
                quizActivityGame.s();
                t tVar2 = quizActivityGame.E;
                if (tVar2 != null) {
                    ((Button) tVar2.f2458f).setOnClickListener(new a(quizActivityGame, 2));
                    return;
                } else {
                    d.g("bindingQuiz");
                    throw null;
                }
            case 2:
                int i5 = QuizActivityGame.I;
                quizActivityGame.r();
                return;
            default:
                int i6 = QuizActivityGame.I;
                quizActivityGame.finish();
                return;
        }
    }
}
