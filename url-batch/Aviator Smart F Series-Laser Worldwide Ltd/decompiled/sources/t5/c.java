package t5;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public interface c {
    public static final int ACTION_STATE_DRAG = 2;
    public static final int ACTION_STATE_IDLE = 0;
    public static final int ACTION_STATE_SWIPE = 1;

    void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i8);
}
