package com.bytedance.sdk.openadsdk.rt.zmn;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.core.hhw.btk;
import com.bytedance.sdk.openadsdk.core.hhw.fb;
import com.bytedance.sdk.openadsdk.core.hhw.zg;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class fs extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private InterfaceC0204fs btk;
    private Context zmn;
    private List<Object> fs = new ArrayList();
    private List<com.bytedance.sdk.openadsdk.rt.zmn.zmn> zn = new ArrayList();
    private List<com.bytedance.sdk.openadsdk.rt.zmn.zmn> fb = new ArrayList();

    /* renamed from: com.bytedance.sdk.openadsdk.rt.zmn.fs$fs, reason: collision with other inner class name */
    public interface InterfaceC0204fs {
        void zmn(com.bytedance.sdk.openadsdk.rt.zmn.zmn zmnVar);
    }

    public void zmn(InterfaceC0204fs interfaceC0204fs) {
        this.btk = interfaceC0204fs;
    }

    public fs(Context context) {
        this.zmn = context.getApplicationContext();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void zmn(List<com.bytedance.sdk.openadsdk.rt.zmn.zmn> list) {
        this.zn.clear();
        this.fb.clear();
        if (list != null) {
            long currentTimeMillis = System.currentTimeMillis() - 604800000;
            for (com.bytedance.sdk.openadsdk.rt.zmn.zmn zmnVar : list) {
                try {
                    if (Long.parseLong(zmnVar.hhw()) >= currentTimeMillis) {
                        this.zn.add(zmnVar);
                    } else {
                        this.fb.add(zmnVar);
                    }
                } catch (NumberFormatException unused) {
                    this.zn.add(zmnVar);
                }
            }
        }
        zmn();
        notifyDataSetChanged();
    }

    private void zmn() {
        this.fs.clear();
        if (!this.zn.isEmpty()) {
            List<Object> list = this.fs;
            Context context = this.zmn;
            list.add(context.getString(doe.fs(context, "tt_history_this_week")));
            this.fs.addAll(this.zn);
        }
        if (this.fb.isEmpty()) {
            return;
        }
        List<Object> list2 = this.fs;
        Context context2 = this.zmn;
        list2.add(context2.getString(doe.fs(context2, "tt_history_a_week_ago")));
        this.fs.addAll(this.fb);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.fs.get(i) instanceof String ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            zg zgVar = new zg(this.zmn);
            zgVar.setPadding(zmn(16.0f), zmn(8.0f), 0, zmn(8.0f));
            zgVar.setTextSize(14.0f);
            int i2 = Build.VERSION.SDK_INT;
            zgVar.setTextAppearance(R.style.TextAppearance.Material.Medium);
            Typeface create = i2 >= 28 ? Typeface.create(zgVar.getTypeface(), 500, false) : null;
            if (create != null) {
                zgVar.setTypeface(create);
            }
            zgVar.setTextColor(Color.argb(167, 0, 0, 0));
            zgVar.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new zn(zgVar);
        }
        return new zmn(fs());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Object obj = this.fs.get(i);
        if (viewHolder.getItemViewType() == 0) {
            ((zn) viewHolder).zmn.setText((String) obj);
        } else {
            ((zmn) viewHolder).zmn((com.bytedance.sdk.openadsdk.rt.zmn.zmn) obj);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.fs.size();
    }

    private btk fs() {
        btk btkVar = new btk(this.zmn);
        btkVar.setOrientation(0);
        btkVar.setLayoutParams(new RecyclerView.LayoutParams(-1, zmn(84.0f)));
        btkVar.setPadding(zmn(16.0f), zmn(10.0f), zmn(16.0f), zmn(10.0f));
        btk btkVar2 = new btk(this.zmn);
        btkVar2.setOrientation(1);
        fb fbVar = new fb(this.zmn);
        fbVar.setId(View.generateViewId());
        fbVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        fbVar.setAdjustViewBounds(true);
        fbVar.setLayoutParams(new LinearLayout.LayoutParams(zmn(64.0f), zmn(64.0f)));
        btkVar2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        btkVar2.setPadding(zmn(8.0f), zmn(0.0f), zmn(0.0f), zmn(0.0f));
        zg zgVar = new zg(this.zmn);
        zgVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int i = Build.VERSION.SDK_INT;
        zgVar.setTextAppearance(R.style.TextAppearance.Material.Medium);
        Typeface create = i >= 28 ? Typeface.create(zgVar.getTypeface(), 500, false) : null;
        if (create != null) {
            zgVar.setTypeface(create);
        }
        zgVar.setLineSpacing(0.0f, 1.3f);
        zgVar.setLetterSpacing(0.0067f);
        zgVar.setTextColor(Color.argb(255, 0, 0, 0));
        zgVar.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        zgVar.setEllipsize(truncateAt);
        zgVar.setId(View.generateViewId());
        zgVar.setTextSize(0, zmn(14.0f));
        zgVar.setIncludeFontPadding(false);
        zg zgVar2 = new zg(this.zmn);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = zmn(4.0f);
        zgVar2.setLayoutParams(layoutParams);
        Typeface create2 = i >= 28 ? Typeface.create(zgVar.getTypeface(), 400, false) : null;
        if (create2 != null) {
            zgVar2.setTypeface(create2);
        }
        zgVar2.setLineSpacing(0.0f, 1.3f);
        zgVar2.setLetterSpacing(0.0067f);
        zgVar2.setTextColor(Color.argb(166, 0, 0, 0));
        zgVar2.setMaxLines(1);
        zgVar2.setEllipsize(truncateAt);
        zgVar2.setId(View.generateViewId());
        zgVar2.setTextSize(0, zmn(14.0f));
        zgVar2.setIncludeFontPadding(false);
        zg zgVar3 = new zg(this.zmn);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = zmn(8.0f);
        zgVar3.setLayoutParams(layoutParams2);
        zgVar3.setTextAppearance(R.style.TextAppearance.Material.Caption);
        zgVar3.setTextColor(Color.argb(166, 0, 0, 0));
        zgVar3.setId(View.generateViewId());
        Typeface create3 = i >= 28 ? Typeface.create(zgVar.getTypeface(), 400, false) : null;
        if (create3 != null) {
            zgVar3.setTypeface(create3);
        }
        zgVar3.setLineSpacing(0.0f, 1.3f);
        zgVar3.setLetterSpacing(0.0067f);
        zgVar3.setTextColor(Color.argb(166, 0, 0, 0));
        zgVar3.setMaxLines(1);
        zgVar3.setEllipsize(truncateAt);
        zgVar3.setId(View.generateViewId());
        zgVar3.setTextSize(0, zmn(12.0f));
        zgVar3.setIncludeFontPadding(false);
        btkVar.addView(fbVar);
        btkVar.addView(btkVar2);
        btkVar2.addView(zgVar);
        btkVar2.addView(zgVar2);
        btkVar2.addView(zgVar3);
        btkVar.setTag(new View[]{fbVar, zgVar, zgVar2, zgVar3});
        return btkVar;
    }

    class zn extends RecyclerView.ViewHolder {
        zg zmn;

        zn(View view) {
            super(view);
            this.zmn = (zg) view;
        }
    }

    class zmn extends RecyclerView.ViewHolder {
        zg fb;
        zg fs;
        fb zmn;
        zg zn;

        zmn(View view) {
            super(view);
            View[] viewArr = (View[]) view.getTag();
            this.zmn = (fb) viewArr[0];
            this.fs = (zg) viewArr[1];
            this.zn = (zg) viewArr[2];
            this.fb = (zg) viewArr[3];
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.rt.zmn.fs.zmn.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/rt/zmn/fs$zmn$1;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view2);
                    safedk_fs$zmn$1_onClick_90317ce61e79754912f04d6908b23590(view2);
                }

                public void safedk_fs$zmn$1_onClick_90317ce61e79754912f04d6908b23590(View p0) {
                    int adapterPosition = zmn.this.getAdapterPosition();
                    if (adapterPosition != -1) {
                        Object obj = fs.this.fs.get(adapterPosition);
                        if (obj instanceof com.bytedance.sdk.openadsdk.rt.zmn.zmn) {
                            fs.this.zmn((com.bytedance.sdk.openadsdk.rt.zmn.zmn) obj);
                        }
                    }
                }
            });
        }

        void zmn(com.bytedance.sdk.openadsdk.rt.zmn.zmn zmnVar) {
            try {
                String btk = zmnVar.btk();
                this.fs.setText(zmnVar.fb());
                this.zn.setText(btk);
                this.fb.setText(new SimpleDateFormat("MMM dd · HH:mm", Locale.US).format(new Date(Long.parseLong(zmnVar.hhw()))));
                this.zmn.setImageResource(com.bytedance.R.drawable.tt_history_placeholder);
                if (TextUtils.isEmpty(btk)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.iv.fb.zmn(com.bytedance.sdk.openadsdk.rt.zmn.zmn.zn.zmn().zmn(btk)).zn(1).zmn(this.zmn);
            } catch (Exception e) {
                iqz.zmn("IABHSecAdapter", "bind error: ", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(com.bytedance.sdk.openadsdk.rt.zmn.zmn zmnVar) {
        InterfaceC0204fs interfaceC0204fs = this.btk;
        if (interfaceC0204fs != null) {
            interfaceC0204fs.zmn(zmnVar);
        }
    }

    private int zmn(float f) {
        return jy.fs(this.zmn, f);
    }
}
