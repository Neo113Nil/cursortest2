package com.linecorp.linesdk.dialog.internal;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.linecorp.linesdk.R;
import com.linecorp.linesdk.dialog.internal.GetTargetUserTask;
import com.linecorp.linesdk.dialog.internal.TargetListAdapter;
import com.linecorp.linesdk.dialog.internal.TargetUser;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public class SendMessageTargetPagerAdapter extends androidx.viewpager.widget.a {
    private Context context;
    private TargetListAdapter.OnSelectedChangeListener listener;
    private SendMessagePresenter presenter;
    private HashMap<TargetUser.Type, TargetListWithSearchView> viewHashMap = new HashMap<>();

    /* renamed from: com.linecorp.linesdk.dialog.internal.SendMessageTargetPagerAdapter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$linecorp$linesdk$dialog$internal$TargetUser$Type;

        static {
            int[] iArr = new int[TargetUser.Type.values().length];
            $SwitchMap$com$linecorp$linesdk$dialog$internal$TargetUser$Type = iArr;
            try {
                iArr[TargetUser.Type.FRIEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$linecorp$linesdk$dialog$internal$TargetUser$Type[TargetUser.Type.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public SendMessageTargetPagerAdapter(Context context, SendMessagePresenter sendMessagePresenter, TargetListAdapter.OnSelectedChangeListener onSelectedChangeListener) {
        this.context = context;
        this.presenter = sendMessagePresenter;
        this.listener = onSelectedChangeListener;
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return TargetUser.getTargetTypeCount();
    }

    @Override // androidx.viewpager.widget.a
    public CharSequence getPageTitle(int i4) {
        int i5 = AnonymousClass1.$SwitchMap$com$linecorp$linesdk$dialog$internal$TargetUser$Type[TargetUser.Type.values()[i4].ordinal()];
        return i5 != 1 ? i5 != 2 ? "" : this.context.getString(R.string.select_tab_groups) : this.context.getString(R.string.select_tab_friends);
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    public void unSelect(TargetUser targetUser) {
        this.viewHashMap.get(targetUser.getType()).unSelect(targetUser);
    }

    @Override // androidx.viewpager.widget.a
    @NonNull
    public View instantiateItem(@NonNull ViewGroup viewGroup, int i4) {
        final TargetListWithSearchView targetListWithSearchView;
        TargetUser.Type type = TargetUser.Type.values()[i4];
        int i5 = AnonymousClass1.$SwitchMap$com$linecorp$linesdk$dialog$internal$TargetUser$Type[type.ordinal()];
        if (i5 == 1) {
            targetListWithSearchView = new TargetListWithSearchView(this.context, R.string.search_no_fiend, this.listener);
            this.presenter.getFriends(new GetTargetUserTask.NextAction() { // from class: com.linecorp.linesdk.dialog.internal.a
                @Override // com.linecorp.linesdk.dialog.internal.GetTargetUserTask.NextAction
                public final void run(List list) {
                    TargetListWithSearchView.this.addTargetUsers(list);
                }
            });
        } else {
            if (i5 != 2) {
                return null;
            }
            targetListWithSearchView = new TargetListWithSearchView(this.context, R.string.search_no_group, this.listener);
            this.presenter.getGroups(new GetTargetUserTask.NextAction() { // from class: com.linecorp.linesdk.dialog.internal.a
                @Override // com.linecorp.linesdk.dialog.internal.GetTargetUserTask.NextAction
                public final void run(List list) {
                    TargetListWithSearchView.this.addTargetUsers(list);
                }
            });
        }
        this.viewHashMap.put(type, targetListWithSearchView);
        viewGroup.addView(targetListWithSearchView);
        return targetListWithSearchView;
    }
}
