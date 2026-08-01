package com.bytedance.sdk.openadsdk.common;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.dislike.NB;
import com.bytedance.sdk.openadsdk.dislike.TTDislikeListView;
import com.bytedance.sdk.openadsdk.dislike.vG;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.kj;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class TTAdDislikeDialog extends PAGFrameLayout {
    private RelativeLayout Jd;
    private com.bytedance.sdk.openadsdk.dislike.NB Ju;
    private pvs Mxy;
    private View NB;
    private Context Wyp;
    private TTDislikeListView icD;
    private boolean kj;
    private View pvs;
    private String qh;
    private vG.icD sUS;
    private cR so;
    private TTDislikeListView vG;
    private vG.icD yiw;

    public interface pvs {
        void icD(View view);

        void pvs(int i, FilterWord filterWord);

        void pvs(View view);
    }

    public TTAdDislikeDialog(Context context, cR cRVar) {
        this(context.getApplicationContext());
        this.Wyp = context;
        this.so = cRVar;
        Jd();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TTAdDislikeDialog(Context context) {
        this(context, (AttributeSet) null);
    }

    public TTAdDislikeDialog(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTAdDislikeDialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.kj = false;
        pvs(context, attributeSet);
    }

    private void pvs(Context context, AttributeSet attributeSet) {
        setClickable(true);
        setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTAdDislikeDialog.this.icD();
            }
        });
        setBackgroundColor(Color.parseColor("#80000000"));
        this.pvs = new com.bytedance.sdk.openadsdk.dislike.Jd().pvs(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        layoutParams.leftMargin = Pj.icD(getContext(), 20.0f);
        layoutParams.rightMargin = Pj.icD(getContext(), 20.0f);
        this.pvs.setLayoutParams(layoutParams);
        this.pvs.setClickable(true);
        NB();
        Jd();
    }

    public void setDislikeSource(String str) {
        this.qh = str;
        this.icD.setDislikeSource(str);
        this.vG.setDislikeSource(this.qh);
    }

    private void Jd() {
        if (this.so == null) {
            return;
        }
        LayoutInflater from = LayoutInflater.from(getContext());
        vG.icD icd = new vG.icD(from, this.so.Ayu());
        this.sUS = icd;
        this.icD.setAdapter((ListAdapter) icd);
        vG.icD icd2 = new vG.icD(from, new ArrayList());
        this.yiw = icd2;
        icd2.pvs(false);
        this.vG.setAdapter((ListAdapter) this.yiw);
        this.icD.setMaterialMeta(this.so.HWd());
        this.vG.setMaterialMeta(this.so.HWd());
    }

    private void NB() {
        this.Jd = (RelativeLayout) this.pvs.findViewById(kj.VR);
        this.NB = this.pvs.findViewById(kj.gOj);
        PAGTextView pAGTextView = (PAGTextView) this.pvs.findViewById(kj.Es);
        TextView textView = (TextView) this.pvs.findViewById(kj.bGM);
        TextView textView2 = (TextView) this.pvs.findViewById(kj.Uv);
        textView.setText(uc.pvs(getContext(), "tt_dislike_header_tv_back"));
        textView2.setText(uc.pvs(getContext(), "tt_dislike_header_tv_title"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTAdDislikeDialog.this.sUS();
                if (TTAdDislikeDialog.this.Mxy != null) {
                    pvs unused = TTAdDislikeDialog.this.Mxy;
                }
            }
        });
        if (pAGTextView != null) {
            pAGTextView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTAdDislikeDialog.this.vG();
                }
            });
        }
        TTDislikeListView tTDislikeListView = (TTDislikeListView) this.pvs.findViewById(kj.fl);
        this.icD = tTDislikeListView;
        tTDislikeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.4
            /* JADX WARN: Type inference failed for: r1v6, types: [android.widget.Adapter] */
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                try {
                    FilterWord filterWord = (FilterWord) adapterView.getAdapter().getItem(i);
                    if (filterWord.hasSecondOptions()) {
                        TTAdDislikeDialog.this.pvs(filterWord);
                        if (TTAdDislikeDialog.this.Mxy != null) {
                            TTAdDislikeDialog.this.Mxy.pvs(i, filterWord);
                            return;
                        }
                        return;
                    }
                } catch (Throwable unused) {
                }
                if (TTAdDislikeDialog.this.Mxy != null) {
                    try {
                        TTAdDislikeDialog.this.Mxy.pvs(i, TTAdDislikeDialog.this.so.Ayu().get(i));
                    } catch (Throwable unused2) {
                    }
                }
                TTAdDislikeDialog.this.icD();
            }
        });
        TTDislikeListView tTDislikeListView2 = (TTDislikeListView) this.pvs.findViewById(kj.AMP);
        this.vG = tTDislikeListView2;
        tTDislikeListView2.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.5
            /* JADX WARN: Type inference failed for: r1v1, types: [android.widget.Adapter] */
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (TTAdDislikeDialog.this.Mxy != null) {
                    try {
                        TTAdDislikeDialog.this.Mxy.pvs(i, (FilterWord) adapterView.getAdapter().getItem(i));
                    } catch (Throwable unused) {
                    }
                }
                TTAdDislikeDialog.this.icD();
            }
        });
    }

    public void pvs() {
        if (this.pvs.getParent() == null) {
            addView(this.pvs);
        }
        sUS();
        setVisibility(0);
        this.kj = true;
        pvs pvsVar = this.Mxy;
        if (pvsVar != null) {
            pvsVar.pvs(this);
        }
    }

    public void icD() {
        setVisibility(8);
        this.kj = false;
        pvs pvsVar = this.Mxy;
        if (pvsVar != null) {
            pvsVar.icD(this);
        }
    }

    public void setCallback(pvs pvsVar) {
        this.Mxy = pvsVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sUS() {
        RelativeLayout relativeLayout = this.Jd;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        View view = this.NB;
        if (view != null) {
            view.setVisibility(8);
        }
        TTDislikeListView tTDislikeListView = this.icD;
        if (tTDislikeListView != null) {
            tTDislikeListView.setVisibility(0);
        }
        vG.icD icd = this.yiw;
        if (icd != null) {
            icd.pvs();
        }
        TTDislikeListView tTDislikeListView2 = this.vG;
        if (tTDislikeListView2 != null) {
            tTDislikeListView2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        vG.icD icd = this.yiw;
        if (icd != null) {
            icd.pvs(filterWord.getOptions());
        }
        RelativeLayout relativeLayout = this.Jd;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        View view = this.NB;
        if (view != null) {
            view.setVisibility(0);
        }
        TTDislikeListView tTDislikeListView = this.icD;
        if (tTDislikeListView != null) {
            tTDislikeListView.setVisibility(8);
        }
        TTDislikeListView tTDislikeListView2 = this.vG;
        if (tTDislikeListView2 != null) {
            tTDislikeListView2.setVisibility(0);
        }
    }

    public void vG() {
        Context context = this.Wyp;
        if (context instanceof Activity) {
            boolean z = !((Activity) context).isFinishing();
            com.bytedance.sdk.openadsdk.dislike.NB nb = new com.bytedance.sdk.openadsdk.dislike.NB(this.Wyp);
            this.Ju = nb;
            nb.pvs(yiw());
            this.Ju.pvs(this.so.HWd(), this.so.wjr().toString());
            this.Ju.pvs(this.qh);
            if (!z || this.Ju.isShowing()) {
                return;
            }
            this.Ju.show();
        }
    }

    private NB.pvs yiw() {
        return new NB.pvs() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.6
            @Override // com.bytedance.sdk.openadsdk.dislike.NB.pvs
            public void pvs() {
                TTAdDislikeDialog.this.setVisibility(8);
            }

            @Override // com.bytedance.sdk.openadsdk.dislike.NB.pvs
            public void icD() {
                TTAdDislikeDialog.this.setVisibility(0);
            }

            @Override // com.bytedance.sdk.openadsdk.dislike.NB.pvs
            public void vG() {
                TTAdDislikeDialog.this.setVisibility(0);
            }

            @Override // com.bytedance.sdk.openadsdk.dislike.NB.pvs
            public void pvs(int i, FilterWord filterWord) {
                if (TTAdDislikeDialog.this.Mxy != null) {
                    TTAdDislikeDialog.this.Mxy.pvs(i, filterWord);
                    TTAdDislikeDialog.this.Mxy.icD(TTAdDislikeDialog.this);
                }
            }
        };
    }
}
