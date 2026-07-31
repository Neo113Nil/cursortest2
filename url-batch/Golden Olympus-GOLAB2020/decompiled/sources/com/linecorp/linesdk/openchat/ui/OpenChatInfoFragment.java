package com.linecorp.linesdk.openchat.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractActivityC1333h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C;
import androidx.lifecycle.a0;
import com.linecorp.linesdk.R;
import com.linecorp.linesdk.databinding.OpenChatInfoFragmentBinding;
import com.linecorp.linesdk.openchat.KotlinExtensionsKt;
import com.linecorp.linesdk.openchat.OpenChatCategory;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class OpenChatInfoFragment extends Fragment {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private OpenChatInfoFragmentBinding binding;
    private OpenChatInfoViewModel viewModel;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OpenChatInfoFragment newInstance() {
            return new OpenChatInfoFragment();
        }

        private Companion() {
        }
    }

    private final String generateTextLengthLimitString(String str, int i4) {
        int resourceInt = getResourceInt(i4);
        StringBuilder sb = new StringBuilder();
        sb.append(str.length());
        sb.append('/');
        sb.append(resourceInt);
        return sb.toString();
    }

    private final int getResourceInt(int i4) {
        return requireActivity().getResources().getInteger(i4);
    }

    private final void setupCategoryLabel() {
        ((TextView) _$_findCachedViewById(R.id.categoryLabelTextView)).setOnClickListener(new View.OnClickListener() { // from class: com.linecorp.linesdk.openchat.ui.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OpenChatInfoFragment.setupCategoryLabel$lambda$9(OpenChatInfoFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupCategoryLabel$lambda$9(OpenChatInfoFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showCategorySelectionDialog();
    }

    private final void setupDescription() {
        EditText descriptionEditText = (EditText) _$_findCachedViewById(R.id.descriptionEditText);
        Intrinsics.checkNotNullExpressionValue(descriptionEditText, "descriptionEditText");
        OpenChatInfoViewModel openChatInfoViewModel = this.viewModel;
        if (openChatInfoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            openChatInfoViewModel = null;
        }
        KotlinExtensionsKt.addAfterTextChangedAction(descriptionEditText, new OpenChatInfoFragment$setupDescription$1(openChatInfoViewModel.getDescription()));
    }

    private final void setupName() {
        EditText nameEditText = (EditText) _$_findCachedViewById(R.id.nameEditText);
        Intrinsics.checkNotNullExpressionValue(nameEditText, "nameEditText");
        OpenChatInfoViewModel openChatInfoViewModel = this.viewModel;
        if (openChatInfoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            openChatInfoViewModel = null;
        }
        KotlinExtensionsKt.addAfterTextChangedAction(nameEditText, new OpenChatInfoFragment$setupName$1(openChatInfoViewModel.getChatroomName()));
    }

    private final void setupSearchOption() {
        ((CheckBox) _$_findCachedViewById(R.id.searchIncludedCheckBox)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.linecorp.linesdk.openchat.ui.l
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                OpenChatInfoFragment.setupSearchOption$lambda$7(OpenChatInfoFragment.this, compoundButton, z4);
            }
        });
        ((ConstraintLayout) _$_findCachedViewById(R.id.searchIncludedContainer)).setOnClickListener(new View.OnClickListener() { // from class: com.linecorp.linesdk.openchat.ui.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OpenChatInfoFragment.setupSearchOption$lambda$8(OpenChatInfoFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupSearchOption$lambda$7(OpenChatInfoFragment this$0, CompoundButton compoundButton, boolean z4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OpenChatInfoViewModel openChatInfoViewModel = this$0.viewModel;
        if (openChatInfoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            openChatInfoViewModel = null;
        }
        openChatInfoViewModel.isSearchIncluded().o(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupSearchOption$lambda$8(OpenChatInfoFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((CheckBox) this$0._$_findCachedViewById(R.id.searchIncludedCheckBox)).toggle();
    }

    private final void setupToolbar() {
        Toolbar toolbar = (Toolbar) requireActivity().findViewById(R.id.toolbar);
        toolbar.setTitle(getString(R.string.openchat_create_room_title));
        toolbar.getMenu().clear();
        toolbar.inflateMenu(R.menu.menu_openchat_info);
        final MenuItem findItem = toolbar.getMenu().findItem(R.id.menu_item_openchat_next);
        findItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.linecorp.linesdk.openchat.ui.n
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean z4;
                z4 = OpenChatInfoFragment.setupToolbar$lambda$5(OpenChatInfoFragment.this, menuItem);
                return z4;
            }
        });
        OpenChatInfoViewModel openChatInfoViewModel = this.viewModel;
        if (openChatInfoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            openChatInfoViewModel = null;
        }
        openChatInfoViewModel.isValid().i(this, new C() { // from class: com.linecorp.linesdk.openchat.ui.o
            @Override // androidx.lifecycle.C
            public final void d(Object obj) {
                OpenChatInfoFragment.setupToolbar$lambda$6(findItem, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupToolbar$lambda$5(OpenChatInfoFragment this$0, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        if (menuItem.getItemId() != R.id.menu_item_openchat_next) {
            return false;
        }
        AbstractActivityC1333h requireActivity = this$0.requireActivity();
        Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type com.linecorp.linesdk.openchat.ui.CreateOpenChatActivity");
        ((CreateOpenChatActivity) requireActivity).goToNextScreen();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupToolbar$lambda$6(MenuItem menuItem, Boolean bool) {
        menuItem.setEnabled(bool == null ? false : bool.booleanValue());
    }

    private final void setupViewModel() {
        this.viewModel = (OpenChatInfoViewModel) a0.a(requireActivity()).a(OpenChatInfoViewModel.class);
        OpenChatInfoFragmentBinding openChatInfoFragmentBinding = this.binding;
        OpenChatInfoViewModel openChatInfoViewModel = null;
        if (openChatInfoFragmentBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            openChatInfoFragmentBinding = null;
        }
        OpenChatInfoViewModel openChatInfoViewModel2 = this.viewModel;
        if (openChatInfoViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            openChatInfoViewModel2 = null;
        }
        openChatInfoFragmentBinding.setViewModel(openChatInfoViewModel2);
        OpenChatInfoViewModel openChatInfoViewModel3 = this.viewModel;
        if (openChatInfoViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            openChatInfoViewModel3 = null;
        }
        openChatInfoViewModel3.getChatroomName().i(this, new C() { // from class: com.linecorp.linesdk.openchat.ui.i
            @Override // androidx.lifecycle.C
            public final void d(Object obj) {
                OpenChatInfoFragment.setupViewModel$lambda$0(OpenChatInfoFragment.this, (String) obj);
            }
        });
        OpenChatInfoViewModel openChatInfoViewModel4 = this.viewModel;
        if (openChatInfoViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            openChatInfoViewModel4 = null;
        }
        openChatInfoViewModel4.getDescription().i(this, new C() { // from class: com.linecorp.linesdk.openchat.ui.j
            @Override // androidx.lifecycle.C
            public final void d(Object obj) {
                OpenChatInfoFragment.setupViewModel$lambda$1(OpenChatInfoFragment.this, (String) obj);
            }
        });
        OpenChatInfoViewModel openChatInfoViewModel5 = this.viewModel;
        if (openChatInfoViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            openChatInfoViewModel = openChatInfoViewModel5;
        }
        openChatInfoViewModel.getCategory().i(this, new C() { // from class: com.linecorp.linesdk.openchat.ui.k
            @Override // androidx.lifecycle.C
            public final void d(Object obj) {
                OpenChatInfoFragment.setupViewModel$lambda$3(OpenChatInfoFragment.this, (OpenChatCategory) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupViewModel$lambda$0(OpenChatInfoFragment this$0, String name) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TextView textView = (TextView) this$0._$_findCachedViewById(R.id.nameMaxTextView);
        Intrinsics.checkNotNullExpressionValue(name, "name");
        textView.setText(this$0.generateTextLengthLimitString(name, R.integer.max_chatroom_name_length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupViewModel$lambda$1(OpenChatInfoFragment this$0, String name) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TextView textView = (TextView) this$0._$_findCachedViewById(R.id.descriptionMaxTextView);
        Intrinsics.checkNotNullExpressionValue(name, "name");
        textView.setText(this$0.generateTextLengthLimitString(name, R.integer.max_chatroom_description_length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupViewModel$lambda$3(OpenChatInfoFragment this$0, OpenChatCategory openChatCategory) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (openChatCategory != null) {
            ((TextView) this$0._$_findCachedViewById(R.id.categoryLabelTextView)).setText(this$0.getResources().getString(openChatCategory.getResourceId()));
        }
    }

    private final void setupViews() {
        setupToolbar();
        setupName();
        setupDescription();
        setupCategoryLabel();
        setupSearchOption();
    }

    private final androidx.appcompat.app.c showCategorySelectionDialog() {
        c.a aVar = new c.a(requireContext());
        OpenChatInfoViewModel openChatInfoViewModel = this.viewModel;
        if (openChatInfoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            openChatInfoViewModel = null;
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        return aVar.e(openChatInfoViewModel.getCategoryStringArray(requireContext), new DialogInterface.OnClickListener() { // from class: com.linecorp.linesdk.openchat.ui.p
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                OpenChatInfoFragment.showCategorySelectionDialog$lambda$10(OpenChatInfoFragment.this, dialogInterface, i4);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCategorySelectionDialog$lambda$10(OpenChatInfoFragment this$0, DialogInterface dialogInterface, int i4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OpenChatInfoViewModel openChatInfoViewModel = this$0.viewModel;
        OpenChatInfoViewModel openChatInfoViewModel2 = null;
        if (openChatInfoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            openChatInfoViewModel = null;
        }
        OpenChatCategory selectedCategory = openChatInfoViewModel.getSelectedCategory(i4);
        OpenChatInfoViewModel openChatInfoViewModel3 = this$0.viewModel;
        if (openChatInfoViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            openChatInfoViewModel2 = openChatInfoViewModel3;
        }
        openChatInfoViewModel2.getCategory().o(selectedCategory);
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
        setupViewModel();
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
        OpenChatInfoFragmentBinding inflate = OpenChatInfoFragmentBinding.inflate(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, container, false)");
        this.binding = inflate;
        OpenChatInfoFragmentBinding openChatInfoFragmentBinding = null;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        inflate.setLifecycleOwner(this);
        OpenChatInfoFragmentBinding openChatInfoFragmentBinding2 = this.binding;
        if (openChatInfoFragmentBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            openChatInfoFragmentBinding = openChatInfoFragmentBinding2;
        }
        return openChatInfoFragmentBinding.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }
}
