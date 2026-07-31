package com.linecorp.linesdk.dialog.internal;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.linecorp.linesdk.R;
import com.linecorp.linesdk.dialog.internal.TargetUser;
import com.squareup.picasso.q;

/* loaded from: classes2.dex */
public class UserThumbnailView extends ConstraintLayout {
    private ImageView imageView;
    private TextView targetUserName;

    public UserThumbnailView(Context context) {
        super(context);
        init();
    }

    private void init() {
        View.inflate(getContext(), R.layout.target_user_thumbnail, this);
        this.targetUserName = (TextView) findViewById(R.id.textViewDisplayName);
        this.imageView = (ImageView) findViewById(R.id.imageViewTargetUser);
    }

    public void setTargetUser(TargetUser targetUser) {
        this.targetUserName.setText(targetUser.getDisplayName());
        q.g().i(targetUser.getPictureUri()).f(targetUser.getType() == TargetUser.Type.FRIEND ? R.drawable.friend_thumbnail : R.drawable.group_thumbnail).d(this.imageView);
    }
}
