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

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SearchView f1385e;

    public a(SearchView searchView) {
        this.f1385e = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SearchView searchView = this.f1385e;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.t;
        if (view == searchView.f1301x) {
            searchView.u(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.f1283P;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
                return;
            }
            return;
        }
        if (view == searchView.f1303z) {
            searchView.k();
            return;
        }
        if (view == searchView.f1302y) {
            searchView.o();
            return;
        }
        if (view != searchView.f1269A) {
            if (view == searchAutoComplete) {
                searchView.j();
                return;
            }
            return;
        }
        SearchableInfo searchableInfo = searchView.f1294f0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    searchView.getContext().startActivity(searchView.i(searchView.f1280M, searchableInfo));
                }
            } else {
                Intent intent = new Intent(searchView.f1279L);
                ComponentName searchActivity = searchableInfo.getSearchActivity();
                intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                searchView.getContext().startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }
}
