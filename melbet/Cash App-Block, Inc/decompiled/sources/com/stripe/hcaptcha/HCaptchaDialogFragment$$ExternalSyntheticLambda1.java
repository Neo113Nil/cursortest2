package com.stripe.hcaptcha;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.search.SearchView;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate;

/* loaded from: classes4.dex */
public final /* synthetic */ class HCaptchaDialogFragment$$ExternalSyntheticLambda1 implements View.OnTouchListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ HCaptchaDialogFragment$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        FragmentActivity activity;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                HCaptchaDialogFragment hCaptchaDialogFragment = (HCaptchaDialogFragment) obj;
                view.getClass();
                if (!hCaptchaDialogFragment.readyForInteraction && hCaptchaDialogFragment.isAdded() && (activity = hCaptchaDialogFragment.getActivity()) != null) {
                    activity.dispatchTouchEvent(motionEvent);
                    break;
                } else {
                    break;
                }
                break;
            case 1:
                SearchView searchView = (SearchView) obj;
                int i2 = SearchView.$r8$clinit;
                if (searchView.isAdjustNothingSoftInputMode()) {
                    searchView.editText.clearFocus();
                    break;
                }
                break;
            default:
                DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = (DropdownMenuEndIconDelegate) obj;
                if (motionEvent.getAction() == 1) {
                    long uptimeMillis = SystemClock.uptimeMillis() - dropdownMenuEndIconDelegate.dropdownPopupActivatedAt;
                    if (uptimeMillis < 0 || uptimeMillis > 300) {
                        dropdownMenuEndIconDelegate.dropdownPopupDirty = false;
                    }
                    dropdownMenuEndIconDelegate.showHideDropdown();
                    dropdownMenuEndIconDelegate.dropdownPopupDirty = true;
                    dropdownMenuEndIconDelegate.dropdownPopupActivatedAt = SystemClock.uptimeMillis();
                    break;
                }
                break;
        }
        return false;
    }
}
