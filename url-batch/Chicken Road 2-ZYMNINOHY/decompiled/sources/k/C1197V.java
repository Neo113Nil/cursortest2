package k;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;

/* renamed from: k.V, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1197V implements TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f13966a;

    public C1197V(SearchView searchView) {
        this.f13966a = searchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
        this.f13966a.o();
        return true;
    }
}
