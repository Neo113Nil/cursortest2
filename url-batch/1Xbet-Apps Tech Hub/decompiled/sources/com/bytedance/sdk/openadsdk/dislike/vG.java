package com.bytedance.sdk.openadsdk.dislike;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.settings.mnm;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.kj;
import com.bytedance.sdk.openadsdk.utils.so;
import java.util.ArrayList;
import java.util.List;

/* compiled from: TTDislikeDialogDefault.java */
/* loaded from: classes2.dex */
public class vG extends TTDislikeDialogAbstract {
    private View Jd;
    private String Mxy;
    private icD NB;
    private List<FilterWord> Wyp;
    private TTDislikeListView icD;
    private TTDislikeListView pvs;
    private icD sUS;
    private String so;
    private RelativeLayout vG;
    private pvs yiw;

    /* compiled from: TTDislikeDialogDefault.java */
    public interface pvs {
        void icD();

        void pvs();

        void pvs(int i, FilterWord filterWord);

        void vG();
    }

    public vG(Context context, String str, List<FilterWord> list, String str2) {
        super(context, uc.sUS(context, "tt_dislikeDialog"), str2);
        this.Mxy = str;
        this.Wyp = list;
    }

    public void pvs(String str, List<FilterWord> list) {
        icD icd = this.NB;
        if (icd == null || this.Wyp == null || str == null) {
            return;
        }
        this.Mxy = str;
        this.Wyp = list;
        icd.pvs(list);
        setMaterialMeta(str, list);
    }

    public void pvs(pvs pvsVar) {
        this.yiw = pvsVar;
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            setCanceledOnTouchOutside(true);
            setCancelable(true);
            pvs();
            pvs(getContext());
            icD();
            setMaterialMeta(this.Mxy, this.Wyp);
        } catch (Throwable unused) {
            dismiss();
        }
    }

    public void pvs(String str) {
        this.so = str;
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public View getLayoutView() {
        return new Jd().pvs(getContext());
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public int[] getTTDislikeListViewIds() {
        return new int[]{kj.fl, kj.AMP};
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public ViewGroup.LayoutParams getLayoutParams() {
        return new ViewGroup.LayoutParams(Pj.vG(getContext()) - 120, -2);
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
            vG();
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    private void pvs() {
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.y = 50;
            window.setAttributes(attributes);
        }
    }

    private void icD() {
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.bytedance.sdk.openadsdk.dislike.vG.1
            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(DialogInterface dialogInterface) {
                if (vG.this.yiw != null) {
                    pvs unused = vG.this.yiw;
                }
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.bytedance.sdk.openadsdk.dislike.vG.2
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                if (vG.this.yiw != null) {
                    vG.this.yiw.icD();
                }
            }
        });
        icD icd = new icD(getLayoutInflater(), this.Wyp);
        this.NB = icd;
        this.pvs.setAdapter((ListAdapter) icd);
        icD icd2 = new icD(getLayoutInflater(), new ArrayList());
        this.sUS = icd2;
        icd2.pvs(false);
        this.icD.setAdapter((ListAdapter) this.sUS);
    }

    private void pvs(Context context) {
        this.vG = (RelativeLayout) findViewById(kj.VR);
        this.Jd = findViewById(kj.gOj);
        TextView textView = (TextView) findViewById(kj.bGM);
        TextView textView2 = (TextView) findViewById(kj.Uv);
        PAGTextView pAGTextView = (PAGTextView) findViewById(kj.Es);
        textView.setText(uc.pvs(getContext(), "tt_dislike_header_tv_back"));
        textView2.setText(uc.pvs(getContext(), "tt_dislike_header_tv_title"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.dislike.vG.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                vG.this.vG();
                if (vG.this.yiw != null) {
                    vG.this.yiw.vG();
                }
            }
        });
        if (pAGTextView != null) {
            pAGTextView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.dislike.vG.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    vG.this.yiw.pvs();
                }
            });
        }
        TTDislikeListView tTDislikeListView = (TTDislikeListView) findViewById(kj.fl);
        this.pvs = tTDislikeListView;
        tTDislikeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.bytedance.sdk.openadsdk.dislike.vG.5
            /* JADX WARN: Type inference failed for: r1v6, types: [android.widget.Adapter] */
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                try {
                    FilterWord filterWord = (FilterWord) adapterView.getAdapter().getItem(i);
                    if (filterWord.hasSecondOptions()) {
                        vG.this.pvs(filterWord);
                        if (vG.this.yiw != null) {
                            vG.this.yiw.pvs(i, filterWord);
                            return;
                        }
                        return;
                    }
                } catch (Throwable unused) {
                }
                if (vG.this.yiw != null) {
                    try {
                        vG.this.yiw.pvs(i, (FilterWord) vG.this.Wyp.get(i));
                    } catch (Throwable unused2) {
                    }
                }
                vG.this.dismiss();
            }
        });
        this.pvs.setClosedListenerKey(this.so);
        TTDislikeListView tTDislikeListView2 = (TTDislikeListView) findViewById(kj.AMP);
        this.icD = tTDislikeListView2;
        tTDislikeListView2.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.bytedance.sdk.openadsdk.dislike.vG.6
            /* JADX WARN: Type inference failed for: r1v1, types: [android.widget.Adapter] */
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (vG.this.yiw != null) {
                    try {
                        vG.this.yiw.pvs(i, (FilterWord) adapterView.getAdapter().getItem(i));
                    } catch (Throwable unused) {
                    }
                }
                vG.this.dismiss();
            }
        });
        this.icD.setClosedListenerKey(this.so);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vG() {
        RelativeLayout relativeLayout = this.vG;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        View view = this.Jd;
        if (view != null) {
            view.setVisibility(8);
        }
        TTDislikeListView tTDislikeListView = this.pvs;
        if (tTDislikeListView != null) {
            tTDislikeListView.setVisibility(0);
        }
        icD icd = this.sUS;
        if (icd != null) {
            icd.pvs();
        }
        TTDislikeListView tTDislikeListView2 = this.icD;
        if (tTDislikeListView2 != null) {
            tTDislikeListView2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        icD icd = this.sUS;
        if (icd != null) {
            icd.pvs(filterWord.getOptions());
        }
        RelativeLayout relativeLayout = this.vG;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        View view = this.Jd;
        if (view != null) {
            view.setVisibility(0);
        }
        TTDislikeListView tTDislikeListView = this.pvs;
        if (tTDislikeListView != null) {
            tTDislikeListView.setVisibility(8);
        }
        TTDislikeListView tTDislikeListView2 = this.icD;
        if (tTDislikeListView2 != null) {
            tTDislikeListView2.setVisibility(0);
        }
    }

    /* compiled from: TTDislikeDialogDefault.java */
    public static class icD extends BaseAdapter {
        private final List<FilterWord> icD;
        private boolean pvs = true;
        private final LayoutInflater vG;

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        public icD(LayoutInflater layoutInflater, List<FilterWord> list) {
            this.icD = list;
            this.vG = layoutInflater;
        }

        public void pvs(boolean z) {
            this.pvs = z;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            List<FilterWord> list = this.icD;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return this.icD.get(i);
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            pvs pvsVar;
            if (view == null) {
                pvsVar = new pvs();
                view2 = pvs(this.vG.getContext());
                pvsVar.pvs = (TextView) view2.findViewById(kj.udE);
                pvsVar.icD = (ImageView) view2.findViewById(kj.QnQ);
                view2.setTag(pvsVar);
            } else {
                view2 = view;
                pvsVar = (pvs) view.getTag();
            }
            FilterWord filterWord = this.icD.get(i);
            pvsVar.pvs.setText(filterWord.getName());
            if (mnm.Lxj().CjQ()) {
                pvsVar.pvs.setBackground(so.pvs(this.vG.getContext(), "tt_dislike_middle_seletor"));
            } else if (i != this.icD.size() - 1) {
                pvsVar.pvs.setBackground(so.pvs(this.vG.getContext(), "tt_dislike_middle_seletor"));
            } else {
                pvsVar.pvs.setBackground(so.pvs(this.vG.getContext(), "tt_dislike_bottom_seletor"));
            }
            if (this.pvs && i == 0) {
                pvsVar.pvs.setBackground(so.pvs(this.vG.getContext(), "tt_dislike_top_seletor"));
            }
            if (filterWord.hasSecondOptions()) {
                pvsVar.icD.setVisibility(0);
            } else {
                pvsVar.icD.setVisibility(8);
            }
            return view2;
        }

        private View pvs(Context context) {
            PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(context);
            pAGFrameLayout.setLayoutParams(new AbsListView.LayoutParams(-1, -1));
            PAGTextView pAGTextView = new PAGTextView(context);
            pAGTextView.setId(kj.udE);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, Pj.icD(context, 44.0f));
            layoutParams.gravity = 17;
            pAGTextView.setLayoutParams(layoutParams);
            pAGTextView.setGravity(17);
            pAGTextView.setTextColor(Color.parseColor("#FF4A4A4A"));
            pAGTextView.setTextSize(16.0f);
            PAGImageView pAGImageView = new PAGImageView(context);
            pAGImageView.setId(kj.QnQ);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(Pj.icD(context, 44.0f), Pj.icD(context, 44.0f));
            layoutParams2.gravity = 8388629;
            pAGImageView.setLayoutParams(layoutParams2);
            pAGImageView.setRotation(180.0f);
            pAGImageView.setScaleType(ImageView.ScaleType.CENTER);
            pAGImageView.setImageDrawable(so.pvs(context, "tt_lefterbackicon_titlebar_press_wrapper"));
            pAGFrameLayout.addView(pAGTextView);
            pAGFrameLayout.addView(pAGImageView);
            return pAGFrameLayout;
        }

        public void pvs(List<FilterWord> list) {
            if (list == null || list.isEmpty()) {
                return;
            }
            this.icD.clear();
            this.icD.addAll(list);
            notifyDataSetChanged();
        }

        public void pvs() {
            this.icD.clear();
            notifyDataSetChanged();
        }

        /* compiled from: TTDislikeDialogDefault.java */
        private static class pvs {
            ImageView icD;
            TextView pvs;

            private pvs() {
            }
        }
    }
}
