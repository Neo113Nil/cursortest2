package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f4496a;

    public a(SearchView searchView) {
        this.f4496a = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SearchView searchView = this.f4496a;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f4411p;
        if (view == searchView.f4415t) {
            searchView.u(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.L;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
                return;
            }
            return;
        }
        if (view == searchView.v) {
            searchView.k();
            return;
        }
        if (view == searchView.f4416u) {
            searchView.o();
            return;
        }
        if (view != searchView.f4417w) {
            if (view == searchAutoComplete) {
                searchView.j();
                return;
            }
            return;
        }
        SearchableInfo searchableInfo = searchView.f4406b0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    searchView.getContext().startActivity(searchView.i(searchView.f4391I, searchableInfo));
                }
            } else {
                Intent intent = new Intent(searchView.f4390H);
                ComponentName searchActivity = searchableInfo.getSearchActivity();
                intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                searchView.getContext().startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }
}
