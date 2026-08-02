package com.neptunesoft.bacdz.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.makeramen.roundedimageview.RoundedImageView;
import com.neptunesoft.bacdz.R;
import com.neptunesoft.bacdz.SplashScreen;
import com.neptunesoft.bacdz.classobjects.Resources;
import com.neptunesoft.bacdz.listeners.ResourcesListener;
import java.util.List;

/* loaded from: classes4.dex */
public class ResourcesAdapter extends RecyclerView.Adapter<ResourcesViewHolder> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static Bitmap bitmapFb;
    public static Bitmap bitmapInst;
    public static Bitmap bitmapWeb;
    public static Bitmap bitmapYT;
    private final List<Resources> resources;
    private final ResourcesListener resourcesListener;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return position;
    }

    public ResourcesAdapter(List<Resources> resources, ResourcesListener resourcesListener, Context context) {
        this.resources = resources;
        this.resourcesListener = resourcesListener;
        if (SplashScreen.darkmode) {
            bitmapFb = getBitmapFromVectorDrawable(context, R.drawable.resourcesfacebook_dark);
            bitmapYT = getBitmapFromVectorDrawable(context, R.drawable.resourcesyoutube_dark);
            bitmapWeb = getBitmapFromVectorDrawable(context, R.drawable.resourceswebsite_dark);
            bitmapInst = getBitmapFromVectorDrawable(context, R.drawable.resourcesinstagram_dark);
            return;
        }
        bitmapFb = getBitmapFromVectorDrawable(context, R.drawable.resourcesfacebook);
        bitmapYT = getBitmapFromVectorDrawable(context, R.drawable.resourcesyoutube);
        bitmapWeb = getBitmapFromVectorDrawable(context, R.drawable.resourceswebsite);
        bitmapInst = getBitmapFromVectorDrawable(context, R.drawable.resourcesinstagram);
    }

    public static Bitmap getBitmapFromVectorDrawable(Context context, int drawableId) {
        Drawable drawable = ContextCompat.getDrawable(context, drawableId);
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ResourcesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ResourcesViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_container_resources, parent, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ResourcesViewHolder holder, final int position) {
        holder.setResources(this.resources.get(position));
        holder.layoutResources.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.adapter.ResourcesAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResourcesAdapter.this.m772x37e7d6c7(position, view);
            }
        });
    }

    /* renamed from: lambda$onBindViewHolder$0$com-neptunesoft-bacdz-adapter-ResourcesAdapter, reason: not valid java name */
    /* synthetic */ void m772x37e7d6c7(int i, View view) {
        this.resourcesListener.onResourcesClick(this.resources.get(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.resources.size();
    }

    static class ResourcesViewHolder extends RecyclerView.ViewHolder {
        RoundedImageView imageResources;
        LinearLayout layoutResources;
        TextView textContentProvider;
        TextView textLink;
        TextView textPlatform;
        TextView textTitle;

        public ResourcesViewHolder(View itemView) {
            super(itemView);
            this.textTitle = (TextView) itemView.findViewById(R.id.textTitle);
            this.textContentProvider = (TextView) itemView.findViewById(R.id.textContentProvider);
            this.textPlatform = (TextView) itemView.findViewById(R.id.textPlatform);
            this.textLink = (TextView) itemView.findViewById(R.id.textLink);
            this.imageResources = (RoundedImageView) itemView.findViewById(R.id.imageResources);
            this.layoutResources = (LinearLayout) itemView.findViewById(R.id.layoutResources);
        }

        void setResources(Resources resources) {
            if (resources.isDark()) {
                this.layoutResources.setBackgroundResource(R.drawable.background_resources_dark);
            } else {
                this.layoutResources.setBackgroundResource(R.drawable.background_resources);
            }
            this.textTitle.setText(resources.getTitle());
            if (resources.getContentProvider() == null) {
                this.textContentProvider.setVisibility(8);
            } else {
                this.textContentProvider.setText(resources.getContentProvider());
            }
            if (resources.getType().equals("web")) {
                this.textPlatform.setText("رابط الموقع");
                this.imageResources.setImageBitmap(ResourcesAdapter.bitmapWeb);
            } else if (resources.getType().equals("facebook")) {
                this.textPlatform.setText("رابط الصفحة");
                this.imageResources.setImageBitmap(ResourcesAdapter.bitmapFb);
            } else if (resources.getType().equals("instagram")) {
                this.textPlatform.setText("رابط الصفحة");
                this.imageResources.setImageBitmap(ResourcesAdapter.bitmapInst);
            } else {
                this.textPlatform.setText("رابط القناة");
                this.imageResources.setImageBitmap(ResourcesAdapter.bitmapYT);
            }
            this.textLink.setText(resources.getLink());
        }
    }
}
