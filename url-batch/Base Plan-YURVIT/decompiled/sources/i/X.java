package i;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class X implements TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f2182a;

    public X(SearchView searchView) {
        this.f2182a = searchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        this.f2182a.o();
        return true;
    }
}
