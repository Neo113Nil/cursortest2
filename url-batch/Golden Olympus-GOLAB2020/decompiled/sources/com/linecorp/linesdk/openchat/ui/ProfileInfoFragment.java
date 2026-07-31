package com.linecorp.linesdk.openchat.ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C;
import androidx.lifecycle.a0;
import com.linecorp.linesdk.R;
import com.linecorp.linesdk.databinding.ProfileInfoFragmentBinding;
import com.linecorp.linesdk.openchat.KotlinExtensionsKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class ProfileInfoFragment extends Fragment {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private ProfileInfoFragmentBinding binding;
    private OpenChatInfoViewModel viewModel;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ProfileInfoFragment newInstance() {
            return new ProfileInfoFragment();
        }

        private Companion() {
        }
    }

    private final void dismissKeyboard() {
        View currentFocus = requireActivity().getCurrentFocus();
        if (currentFocus == null) {
            return;
        }
        Object systemService = requireActivity().getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
    }

    private final void setupProfileName() {
        EditText displayNameEditText = (EditText) _$_findCachedViewById(R.id.displayNameEditText);
        Intrinsics.checkNotNullExpressionValue(displayNameEditText, "displayNameEditText");
        KotlinExtensionsKt.addAfterTextChangedAction(displayNameEditText, new ProfileInfoFragment$setupProfileName$1(this));
    }

    private final void setupProfileNameGuide() {
        TextView textView = (TextView) _$_findCachedViewById(R.id.displayNameGuide);
        Resources resources = getResources();
        int i4 = R.string.openchat_create_profile_input_guide;
        OpenChatInfoViewModel openChatInfoViewModel = this.viewModel;
        if (openChatInfoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            openChatInfoViewModel = null;
        }
        textView.setText(resources.getString(i4, openChatInfoViewModel.getChatroomName().f()));
    }

    private final void setupToolbar() {
        Toolbar toolbar = (Toolbar) requireActivity().findViewById(R.id.toolbar);
        toolbar.setTitle(getString(R.string.openchat_create_profile_title));
        toolbar.getMenu().clear();
        toolbar.inflateMenu(R.menu.menu_profile_info);
        final MenuItem findItem = toolbar.getMenu().findItem(R.id.menu_item_create_profile_done);
        findItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.linecorp.linesdk.openchat.ui.t
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean z4;
                z4 = ProfileInfoFragment.setupToolbar$lambda$1(ProfileInfoFragment.this, menuItem);
                return z4;
            }
        });
        OpenChatInfoViewModel openChatInfoViewModel = this.viewModel;
        if (openChatInfoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            openChatInfoViewModel = null;
        }
        openChatInfoViewModel.isProfileValid().i(this, new C() { // from class: com.linecorp.linesdk.openchat.ui.u
            @Override // androidx.lifecycle.C
            public final void d(Object obj) {
                ProfileInfoFragment.setupToolbar$lambda$2(findItem, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupToolbar$lambda$1(ProfileInfoFragment this$0, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        if (menuItem.getItemId() != R.id.menu_item_create_profile_done) {
            return false;
        }
        this$0.dismissKeyboard();
        OpenChatInfoViewModel openChatInfoViewModel = this$0.viewModel;
        if (openChatInfoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            openChatInfoViewModel = null;
        }
        openChatInfoViewModel.createChatroom();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupToolbar$lambda$2(MenuItem menuItem, Boolean bool) {
        menuItem.setEnabled(bool == null ? false : bool.booleanValue());
    }

    private final void setupViews() {
        setupToolbar();
        setupProfileName();
        setupProfileNameGuide();
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i4) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i4));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i4)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i4), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        this.viewModel = (OpenChatInfoViewModel) a0.a(requireActivity()).a(OpenChatInfoViewModel.class);
        ProfileInfoFragmentBinding profileInfoFragmentBinding = this.binding;
        OpenChatInfoViewModel openChatInfoViewModel = null;
        if (profileInfoFragmentBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            profileInfoFragmentBinding = null;
        }
        OpenChatInfoViewModel openChatInfoViewModel2 = this.viewModel;
        if (openChatInfoViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            openChatInfoViewModel = openChatInfoViewModel2;
        }
        profileInfoFragmentBinding.setViewModel(openChatInfoViewModel);
        setupViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ProfileInfoFragmentBinding inflate = ProfileInfoFragmentBinding.inflate(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, container, false)");
        this.binding = inflate;
        ProfileInfoFragmentBinding profileInfoFragmentBinding = null;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        inflate.setLifecycleOwner(this);
        ProfileInfoFragmentBinding profileInfoFragmentBinding2 = this.binding;
        if (profileInfoFragmentBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            profileInfoFragmentBinding = profileInfoFragmentBinding2;
        }
        return profileInfoFragmentBinding.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }
}
