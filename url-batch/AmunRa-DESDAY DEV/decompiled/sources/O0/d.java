package O0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.visualfortune.eyerest.GuideActivity;
import com.visualfortune.eyerest.R;
import com.visualfortune.eyerest.RoutinesActivity;
import com.visualfortune.eyerest.SessionCompleteActivity;
import g.AbstractActivityC0131i;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Y0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f609a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0131i f610b;

    public /* synthetic */ d(AbstractActivityC0131i abstractActivityC0131i, int i) {
        this.f609a = i;
        this.f610b = abstractActivityC0131i;
    }

    @Override // Y0.a
    public final Object a() {
        int i = R.id.backButton;
        AbstractActivityC0131i abstractActivityC0131i = this.f610b;
        switch (this.f609a) {
            case 0:
                int i2 = GuideActivity.f1923z;
                View inflate = ((GuideActivity) abstractActivityC0131i).getLayoutInflater().inflate(R.layout.activity_guide, (ViewGroup) null, false);
                Button button = (Button) k1.c.j(inflate, R.id.backButton);
                if (button != null) {
                    i = R.id.guideBody;
                    if (((TextView) k1.c.j(inflate, R.id.guideBody)) != null) {
                        return new P0.a((FrameLayout) inflate, button);
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
            case 1:
                int i3 = RoutinesActivity.f1935z;
                View inflate2 = ((RoutinesActivity) abstractActivityC0131i).getLayoutInflater().inflate(R.layout.activity_routines, (ViewGroup) null, false);
                Button button2 = (Button) k1.c.j(inflate2, R.id.backButton);
                if (button2 != null) {
                    i = R.id.routinesList;
                    LinearLayout linearLayout = (LinearLayout) k1.c.j(inflate2, R.id.routinesList);
                    if (linearLayout != null) {
                        i = R.id.routinesTitle;
                        if (((TextView) k1.c.j(inflate2, R.id.routinesTitle)) != null) {
                            return new P0.d((FrameLayout) inflate2, button2, linearLayout);
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i)));
            default:
                int i4 = SessionCompleteActivity.f1946z;
                View inflate3 = ((SessionCompleteActivity) abstractActivityC0131i).getLayoutInflater().inflate(R.layout.activity_session_complete, (ViewGroup) null, false);
                int i5 = R.id.completeTitle;
                if (((TextView) k1.c.j(inflate3, R.id.completeTitle)) != null) {
                    i5 = R.id.homeButton;
                    Button button3 = (Button) k1.c.j(inflate3, R.id.homeButton);
                    if (button3 != null) {
                        i5 = R.id.sessionDuration;
                        TextView textView = (TextView) k1.c.j(inflate3, R.id.sessionDuration);
                        if (textView != null) {
                            i5 = R.id.sessionExercises;
                            TextView textView2 = (TextView) k1.c.j(inflate3, R.id.sessionExercises);
                            if (textView2 != null) {
                                i5 = R.id.sessionMessage;
                                if (((TextView) k1.c.j(inflate3, R.id.sessionMessage)) != null) {
                                    i5 = R.id.startAnotherButton;
                                    Button button4 = (Button) k1.c.j(inflate3, R.id.startAnotherButton);
                                    if (button4 != null) {
                                        return new P0.f((FrameLayout) inflate3, button3, textView, textView2, button4);
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i5)));
        }
    }
}
